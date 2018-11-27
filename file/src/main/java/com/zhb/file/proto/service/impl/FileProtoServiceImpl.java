package com.zhb.file.proto.service.impl;

import com.zhb.file.proto.service.FileProtoService;
import com.zhb.forever.framework.proto.ProtoResult;
import com.zhb.forever.framework.proto.RemoteCallRs;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午1:58:12
*/

public class FileProtoServiceImpl implements FileProtoService {

    @Override
    public ProtoResult getFileNameById(String id) {
        ProtoResult protoResult = new ProtoResult();
        protoResult.setCallResult(RemoteCallRs.CALLRESULT_SUCCESS);
        protoResult.setProtoBytes("hello world".getBytes());
        return protoResult;
    }

}


