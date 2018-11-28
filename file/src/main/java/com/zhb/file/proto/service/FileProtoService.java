package com.zhb.file.proto.service;

import com.zhb.forever.framework.proto.ProtoResult;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午1:57:54
*/

public interface FileProtoService {
    
    ProtoResult getFileNameById(String id);
    
    ProtoResult getKeyValue(String key,String value);

}


