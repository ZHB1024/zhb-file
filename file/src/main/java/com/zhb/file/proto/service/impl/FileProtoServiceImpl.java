package com.zhb.file.proto.service.impl;

import com.zhb.file.proto.FileProtos;
import com.zhb.file.proto.service.FileProtoService;
import com.zhb.forever.framework.proto.ProtoResult;
import com.zhb.forever.framework.proto.RemoteCallRs;
import com.zhb.forever.framework.proto.protobuf.KeyValueProtobuf;
import com.zhb.forever.framework.proto.protobuf.KeyValueProtobuf.KeyValue;

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

    @Override
    public ProtoResult getKeyValue(String key, String value) {
        ProtoResult protoResult = new ProtoResult();
        protoResult.setCallResult(RemoteCallRs.CALLRESULT_SUCCESS);
        
        FileProtos.FileList.Builder builder = FileProtos.FileList.newBuilder();
        addFileList(builder);
        FileProtos.FileList fileList = builder.build();
        
        protoResult.setProtoBytes(fileList.toByteArray());
        return protoResult;
    }
    
    private void addFileList(FileProtos.FileList.Builder builder) {
        for(int i=0;i<10;i++) {
            FileProtos.File.Builder fileBuilder = FileProtos.File.newBuilder();
            fileBuilder.setId(i);
            fileBuilder.setKey(i+"-"+i);
            fileBuilder.setValue(i+"-------------------");
            FileProtos.File file = fileBuilder.build();
            builder.addFileList(file);
        }
    }

}


