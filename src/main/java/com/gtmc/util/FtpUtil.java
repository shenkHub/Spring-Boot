package com.gtmc.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import com.gtmc.common.macrodef.GtmcConst.ResourceFile;

/**
 * FTP操作共通类
 * 
 * @author common
 *
 */
public class FtpUtil {
	private static FTPClient ftpClient = new FTPClient();
    private static String encoding = System.getProperty("file.encoding");
    
    /**
     * ftp登录
     * @return 登录是否成功
     */
	public static boolean login() { 
	    boolean isLogin = false;      
		try {   
	        String url = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM,"ftpUrl");
	        int port = Integer.valueOf(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM,"ftpProt"));
	        String username = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM,"ftpUser");
            String password = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM,"ftpPassword");
            
            int reply;
            ftpClient.setControlEncoding(encoding);
             
            /*
             *  为了上传和下载中文文件，有些地方建议使用以下两句代替
             *  new String(remotePath.getBytes(encoding),"iso-8859-1")转码。
             *  经过测试，通不过。
             */
//            FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_NT);
//            conf.setServerLanguageCode("zh");
 
            ftpClient.connect(url, port);
            // 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
            ftpClient.login(username, password);// 登录
            // 设置文件传输类型为二进制
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            // 获取ftp登录应答代码
            reply = ftpClient.getReplyCode();
            // 验证是否登陆成功
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                System.err.println("FTP server refused connection.");
            }
            isLogin = true;   
		} catch (SocketException e) {   
			e.printStackTrace();   
		} catch (IOException e) {   
			e.printStackTrace();   
		}
		return isLogin;  
	}   

    /**
     * Description: 向FTP服务器上传文件
     *
     * @Version1.0
     * @param url
     *            FTP服务器hostname
     * @param port
     *            FTP服务器端口
     * @param username
     *            FTP登录账号
     * @param password
     *            FTP登录密码
     * @param path
     *            FTP服务器保存目录,如果是根目录则为“/”
     * @param filename
     *            上传到FTP服务器上的文件名
     * @param input
     *            本地文件输入流
     * @return 成功返回true，否则返回false
     */
    public static boolean uploadFile(String path, String filename, InputStream input) {
        boolean result = false;
 
        try {
            // 转移工作目录至指定目录下
            boolean change = ftpClient.changeWorkingDirectory(path);
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            if (change) {
                result = ftpClient.storeFile(new String(filename.getBytes(encoding),"iso-8859-1"), input);
                if (result) {
                    System.out.println("上传成功!");
                }
            }
            input.close();
            ftpClient.logout();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
 
 
    /**
     * Description: 从FTP服务器下载文件
     *
     * @Version1.0
     * @param url
     *            FTP服务器hostname
     * @param port
     *            FTP服务器端口
     * @param username
     *            FTP登录账号
     * @param password
     *            FTP登录密码
     * @param remotePath
     *            FTP服务器上的相对路径
     * @param fileName
     *            要下载的文件名
     * @param localPath
     *            下载后保存到本地的路径
     * @return
     */
    public static void downFile(String remotePath, String localPath) {
        try {
        	//格式化文件夹
        	remotePath = FileUtil.formatDirectory(remotePath);
        	localPath = FileUtil.formatDirectory(localPath);
        	//创建本地文件夹
        	FileUtil.makeDir(localPath);
            // 转移到FTP服务器目录至指定的目录下
            ftpClient.changeWorkingDirectory(new String(remotePath.getBytes(encoding),"iso-8859-1"));
            // 获取文件列表
            FTPFile[] fs = ftpClient.listFiles();
            for (FTPFile ff : fs) {
            	if(ff.isFile() && ff.getName().endsWith(".csv")){
	                File localFile = new File(localPath + "/" + ff.getName());
	                OutputStream is = new FileOutputStream(localFile);
	                ftpClient.retrieveFile(ff.getName(), is);
	                is.close();
            	} else if(ff.isDirectory()){
            		downFile(remotePath+ff.getName(),localPath+ff.getName());
            	}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 下载文件
     * @throws IOException
     */
	public static void downFile() throws IOException {
        try {
			if(FtpUtil.login()){
	            //下载文件
				String ftpPath = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM,"ftpPath");
				String localPath = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM,"localPath");
				FtpUtil.downFile(ftpPath, localPath);
			}
            ftpClient.logout();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
	}

}
