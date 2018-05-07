package com.xiaoyong.helper;

import com.xiaoyong.utils.PropertiesUtil;

import java.util.Properties;

/**
 * @author : XiaoYong
 * @date : 2018/5/7 11:44
 * Description    :
 */
public class PropertiesHelper {
    private static Properties properties = PropertiesUtil.getProperties("config.properties");

    public static String getBasePackage(String key) {
        return PropertiesUtil.getString(properties, key);
    }

}
