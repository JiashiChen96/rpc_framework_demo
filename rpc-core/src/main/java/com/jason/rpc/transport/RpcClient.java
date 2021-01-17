package com.jason.rpc.transport;

import com.jason.rpc.entity.RpcRequest;
import com.jason.rpc.serializer.CommonSerializer;

public interface RpcClient {

    Object sendRequest(RpcRequest rpcRequest);

    void setSerializer(CommonSerializer serializer);
}
