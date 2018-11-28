package com.zhb.file.client.service.impl;

import java.util.List;

import com.zhb.file.client.converter.FileListConverter;
import com.zhb.file.client.converter.FileTestConverter;
import com.zhb.file.client.service.FileServiceClient;
import com.zhb.file.proto.service.FileProtoService;
import com.zhb.forever.framework.proto.support.ProtoCallTemplate;
import com.zhb.forever.framework.vo.KeyValueVO;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午2:03:16
*/

public class FileServiceClientImpl implements FileServiceClient {
    
    private FileProtoService fileProtoService;

    @Override
    public String getFileNameById(String id) {
        return ProtoCallTemplate.callProtoMethod2(new FileTestConverter(), fileProtoService, "getFileNameById", new Object[]{id}, new Class[] { String.class});
    }
    
    @Override
    public List<KeyValueVO> getFileList(String key, String value) {
        List<KeyValueVO> result = ProtoCallTemplate.callProtoMethod2(new FileListConverter(), fileProtoService, "getKeyValue", new Object[]{key,value}, new Class[] { String.class,String.class});
        return result;
    }

    
    public FileProtoService getFileProtoService() {
        return fileProtoService;
    }

    public void setFileProtoService(FileProtoService fileProtoService) {
        this.fileProtoService = fileProtoService;
    }
}


