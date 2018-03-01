package com.gtmc.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * PropertyUtil.java
 * 
 * @author common
 *
 */
public class PropertyUtil {

    /**
     * 读取资源文件
     * 
     * @param resourceName 资源文件名
     * @return 该资源文件键值Map
     */
    public static Map<String, String> load(String resourceName) {

        ResourceBundle bundle = PropertyResourceBundle.getBundle(resourceName);
        Map<String, String> data = new HashMap<String, String>();

        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = bundle.getString(key);
            data.put(key, value);
        }
        return data;
    }

    /**
     * 读取资源文件键值
     * 
     * @param resourceName 资源文件名
     * @param key key
     * @return 资源文件键值
     */
    public static String getValueByKey(String resourceName, String key) {

        String value = StringUtil.EMPTY_STR;
        Map<String, String> data = load(resourceName);
        if (!data.isEmpty() && data.containsKey(key)) {
            value = StringUtil.nullToEmpty(data.get(key));
        }
        return value;
    }

}
