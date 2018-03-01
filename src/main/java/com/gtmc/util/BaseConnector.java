//package com.gtmc.util;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.gtmc.common.macrodef.GtmcConst.ResourceFile;
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//
//public class BaseConnector {
//	// 队列名称
//	private final static String QUEUE_NAME = "queue";
//	private Channel channel;
//	private Connection connection;
//	/** 日志对象 */
//	private static Logger logger = LoggerFactory.getLogger(BaseConnector.class);
//	
//	public BaseConnector() {
//		try {
//			// 创建连接连接到MQ服务器
//			ConnectionFactory factory = new ConnectionFactory();
//            factory.setHost(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.MQ_SERVER));
//            factory.setUsername(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.MQ_USERNAME));
//            factory.setPassword(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.MQ_PASSWORD));
//            factory.setVirtualHost(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.MQ_VIRTUALHOST));
//            factory.setPort(Integer.parseInt(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.MQ_PORT)));
//			connection = factory.newConnection();
//			// 创建一个通道
//			channel = connection.createChannel();
//			// 指定一个队列
//			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//		} catch (Exception e) {
//			logger.info("创建MQ服务器连接失败:" + PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.MQ_SERVER));
//		}
//	}
//    public Channel getChannel() {
//        return channel;
//    }
//    public Connection getConnection() {
//        return connection;
//    }
//	
//}