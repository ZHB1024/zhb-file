package com.zhb.file.client.service;

import com.zhb.file.client.Constants;
import com.zhb.forever.framework.spring.bean.locator.SpringBeanLocator;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午2:03:52
*/

public class FileServiceClientFactory {
    
    public static FileServiceClient getFileServiceClientBean() {
        Object bean = SpringBeanLocator.getInstance(Constants.FILE_CLIENT_CONF).getBean(Constants.FILE_CLIENT);
        return (FileServiceClient) bean;
    }

}


