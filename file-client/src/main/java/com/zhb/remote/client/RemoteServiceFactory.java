package com.zhb.remote.client;

import com.zhb.forever.framework.spring.bean.locator.SpringBeanLocator;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月26日下午2:27:29
*/

public class RemoteServiceFactory {

    public static IRemoteService getJCaptchaClientBean() {
        Object bean = SpringBeanLocator.getInstance(
                Constants.Remote_CLIENT_CONF).getBean(
                        Constants.Remote_CLIENT);
        return (IRemoteService) bean;
    }

}


