package com.zhb.file.client.converter;

import com.zhb.forever.framework.proto.ProtoResult;
import com.zhb.forever.framework.proto.support.ProtoConverter;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午3:32:45
*/

public class FileTestConverter extends ProtoConverter<String> {

    @Override
    public String converFromProto(ProtoResult paramProtoResult) throws Exception{
        String result = new String(paramProtoResult.getProtoBytes(),"utf-8");
        return result;
    }

}


