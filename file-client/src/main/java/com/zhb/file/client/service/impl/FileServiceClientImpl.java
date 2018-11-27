package com.zhb.file.client.service.impl;

import com.zhb.file.client.service.FileServiceClient;
import com.zhb.file.proto.service.FileProtoService;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月27日下午2:03:16
*/

public class FileServiceClientImpl implements FileServiceClient {
    
    private FileProtoService fileProtoService;

    @Override
    public String getFileName() {
        return fileProtoService.getFileName();
    }

    
    
    
    public FileProtoService getFileProtoService() {
        return fileProtoService;
    }

    public void setFileProtoService(FileProtoService fileProtoService) {
        this.fileProtoService = fileProtoService;
    }
}


