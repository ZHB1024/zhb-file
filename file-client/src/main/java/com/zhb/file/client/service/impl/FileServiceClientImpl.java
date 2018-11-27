package com.zhb.file.client.service.impl;

import java.io.UnsupportedEncodingException;

import com.zhb.file.client.converter.FileTestConverter;
import com.zhb.file.client.service.FileServiceClient;
import com.zhb.file.proto.service.FileProtoService;
import com.zhb.forever.framework.proto.ProtoResult;
import com.zhb.forever.framework.proto.RemoteCallRs;
import com.zhb.forever.framework.proto.support.ProtoCallTemplate;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午2:03:16
*/

public class FileServiceClientImpl implements FileServiceClient {
    
    private FileProtoService fileProtoService;

    @Override
    public String getFileNameById(String id) {
        
        
        /*ProtoResult protoResult = fileProtoService.getFileNameById(id);
        if (protoResult.getCallResult() == RemoteCallRs.CALLRESULT_SUCCESS) {
            try {
                return new String(protoResult.getProtoBytes(),"utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }*/
        return ProtoCallTemplate.callProtoMethod2(new FileTestConverter(), fileProtoService, "getFileNameById", new Object[]{id}, new Class[] { String.class});
    }

    
    
    
    public FileProtoService getFileProtoService() {
        return fileProtoService;
    }

    public void setFileProtoService(FileProtoService fileProtoService) {
        this.fileProtoService = fileProtoService;
    }
}


