package com.zhb.file.client.service;

import java.util.List;

import com.zhb.forever.framework.vo.KeyValueVO;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午2:02:11
*/

public interface FileServiceClient {
    
    
    String getFileNameById(String id);
    

    List<KeyValueVO> getFileList(String key,String value);
}


