package com.gtmc.util;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gtmc.common.macrodef.GtmcConst.CommonValue;
import com.gtmc.common.macrodef.GtmcConst.Result;
import com.gtmc.common.macrodef.GtmcConst.ReturnFlg;
import com.gtmc.common.macrodef.GtmcConst.SysCdFlg;
import com.gtmc.common.macrodef.GtmcConst.SysUserName;

/**
 * StringUtil.java
 * 
 * @author common
 *
 */
public class StringUtil {

    /** 空文字列 */
    public static final String EMPTY_STR = CommonValue.NULL_SPACE;

    /** 编码 */
    public static final String CHARSETNAME = "UTF-8";

    /**
     * 返回結果文字
     * 
     * @param returnFlag 結果CD
     * @return
     */
    public static String getResult(int returnFlag) {

        if (returnFlag == ReturnFlg.SUCESS) {
            return Result.SUCESS;
        }
        return Result.FAIL;
    }

    /**
     * 长度检查
     * 
     * @param str 待检查字段
     * @param length 允许长度
     * @return 检查结果
     */
    public static boolean overLength(String str, int length) {

        if (nullToEmpty(str).length() > length) {
            return true;
        }
        return false;
    }

    /**
     * 长度检查（字节数）
     * 
     * @param str 待检查字段
     * @param length 允许长度
     * @return 检查结果
     */
    public static boolean overLengthByByte(String str, int length) {

        int len = 0;
        try {
            len = nullToEmpty(str).getBytes(CHARSETNAME).length;
        } catch (Exception e) {
            return true;
        }
        if (len > length) {
            return true;
        }
        return false;
    }

    /**
     * 文字列转数字
     * 
     * @param str 对象文字列
     * @return 转换结果
     */
    public static BigDecimal string2BigDecimal(String str) {

        BigDecimal num = null;
        try {
            num = new BigDecimal(str);
        } catch (Exception e) {
            num = new BigDecimal(0);
        }
        return num;
    }

    /**
     * 文字列转数字
     * 
     * @param str 对象文字列
     * @return 转换结果
     */
    public static int string2int(String str) {

        int num = -1;
        try {
            num = Integer.parseInt(str);
        } catch (Exception e) {
            return -1;
        }
        return num;
    }

    /**
     * 字符串转Double
     * @param object 对象
     * @return 字符串
     */
    public static double String2double(String str) {

        double num = 0.0;
        try {
            num = Double.parseDouble(str);
        } catch (Exception e) {
            return 0.0;
        }
        return num;
    }

    /**
     * null转空文字列
     * 
     * @param str 待变换文字列
     * @return 转换结果
     */
    public static String nullToEmpty(String str) {

        return nullToValue(str, EMPTY_STR);
    }

    /**
     * null转指定文字列
     * 
     * @param str 待变换文字列
     * @param replacement 变换文字列
     * @return 转换结果
     */
    public static String nullToValue(String str, String replacement) {

        if (null == str || EMPTY_STR.equals(str.trim()) || "NULL".equals(str.trim().toUpperCase())) {
            return replacement;
        }
        return str;
    }

    /**
     * 空文字列判定
     * 
     * @param str 待判定文字列
     * @return 判定结果 空文字列：true
     */
    public static boolean isEmpty(String str) {

        return (nullToEmpty(str).length() == 0);
    }

    /**
     * 去文字列右空格（全半角）
     * 
     * @param str 待处理文字列
     * @return 处理结果
     */
    public static String rtrim(String str) {

        return nullToEmpty(str).replaceAll("[ �@]+$", EMPTY_STR);
    }

    /**
     * 去文字列左空格（全半角）
     * 
     * @param str 待处理文字列
     * @return 处理结果
     */
    public static String ltrim(String str) {

        return nullToEmpty(str).replaceAll("^[ �@]+", EMPTY_STR);
    }

    /**
     * 去文字列左右空格（全半角）
     * 
     * @param str 待处理文字列
     * @return 处理结果
     */
    public static String alltrim(String str) {

        return ltrim(rtrim(str));
    }

    /**
     * 从左侧补足指定文字列
     * 
     * @param s 待处理文字列
     * @param len 检查长度
     * @param pad 补足文字列
     * @return 处理结果
     */
    public static String lpad(String s, int len, String pad) {

        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < len; i++) {
            buf.append(pad);
        }
        buf.append(s);

        return buf.substring(buf.length() - len).toString();

    }

    /**
     * 转换成字符串，空时传空字符串
     * @param object 对象
     * @return 字符串
     */
    public static String valueOf(Object object) {
        String str = EMPTY_STR;
        if (object != null) {
            str = alltrim(String.valueOf(object));
        }
        return str;
    }
    
	/**
	 * 全角转半角
	 * 
	 * @param input　String
	 * @return 半角字符串
	 */
	public static String ToDBC(String input) {
		
		char c[] = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(!isChineseChar(String.valueOf(c[i]))){
				if (c[i] == '\u3000') {
					c[i] = ' ';
				} else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {
					c[i] = (char) (c[i] - 65248);
				}
			}
		}
		String returnString = new String(c);

		return returnString;
	}
    
	/**
	 * 汉字判定
	 * @param input String
	 * @return boolean
	 */
	public static boolean isChineseChar(String str) {
		boolean temp = false;

		Pattern p = Pattern.compile("[\u4e00-\u9fa5]");

		Matcher m = p.matcher(str);

		if (m.find()) {
			temp = true;
		}
		return temp;
	}
	
	/**
	 * 空文字列表判定
	 * @param input List<String>
	 * @return boolean
	 */
	public static boolean isStrListEmpty(List<String> strList) {
		boolean checkflg = false;
		if (strList == null || strList.isEmpty()) {
			checkflg = true;
		} else {
			for (int i = 0; i < strList.size(); i++) {
				if (StringUtil.isEmpty(strList.get(i)))
					checkflg = true;
			}
		}
		return checkflg;
	}
	
	/**
	 * 数字判定
	 * @param input String
	 * @return boolean
	 */
	public static boolean isDigit(String strNum) {  
	    return strNum.matches("[0-9]{1,}");  
	}  

    public static String getUpdateUser(String sysCd) {
        String updateUser = ""; // 更新者
        if (SysCdFlg.SYSCD_ICLUB.equals(sysCd)) {
            updateUser = SysUserName.SYS_NAME_ICLUB;
        } else if (SysCdFlg.SYSCD_GCLUB.equals(sysCd)) {
            updateUser = SysUserName.SYS_NAME_GCLUB;
        } else if(SysCdFlg.SYSCD_EB.equals(sysCd)){
            updateUser = SysUserName.SYS_NAME_EB;
        }
        return updateUser;
    }
}
