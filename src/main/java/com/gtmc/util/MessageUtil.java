package com.gtmc.util;

import com.gtmc.common.macrodef.GtmcConst.ResourceFile;

/**
 * MessageUtil.java
 * 
 * @author common
 *
 */
public class MessageUtil {

    /**
     * message取得
     * 
     * @param messageId message ID
     * @return message
     */
    public static String getMessage(String messageId) {
        
        return PropertyUtil.getValueByKey(ResourceFile.PRO_MESSAGE_NM, messageId);
                
    }
    
    /**
     * message取得
     * 
     * @param messageId message ID
     * @param param 参数
     * @return message
     */
    public static String getMessage(String messageId, String[] param) {
        
        String message = getMessage(messageId);
        
        if (null != param && param.length > 0) {
            
            for (int i = 0; i < param.length; i++) {
                message = message.replace("%"+(i+1), param[i]);
            }
        }
        
        return message;
    }
}
