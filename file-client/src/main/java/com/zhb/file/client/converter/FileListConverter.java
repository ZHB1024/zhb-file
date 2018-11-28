package com.zhb.file.client.converter;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zhb.file.proto.FileProtos;
import com.zhb.forever.framework.proto.ProtoResult;
import com.zhb.forever.framework.proto.support.ProtoConverter;
import com.zhb.forever.framework.vo.KeyValueVO;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月28日上午9:53:36
*/

public class FileListConverter extends ProtoConverter<List<KeyValueVO>> {

    @Override
    public List<KeyValueVO> converFromProto(ProtoResult paramProtoResult) throws InvalidProtocolBufferException {
        List<KeyValueVO> result = new ArrayList<>();
        byte[] datas = paramProtoResult.getProtoBytes();
        FileProtos.FileList fileList = FileProtos.FileList.parseFrom(datas);
        for (FileProtos.File file : fileList.getFileListList()) {
            KeyValueVO vo = new KeyValueVO();
            vo.setId(file.getId()+"");
            vo.setKey(file.getKey());
            vo.setValue(file.getValue());
            result.add(vo);
        }
        return result;
    }

}


