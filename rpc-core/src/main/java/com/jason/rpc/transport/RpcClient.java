package com.jason.rpc.transport;

import com.jason.rpc.entity.RpcRequest;
import com.jason.rpc.serializer.CommonSerializer;

public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
