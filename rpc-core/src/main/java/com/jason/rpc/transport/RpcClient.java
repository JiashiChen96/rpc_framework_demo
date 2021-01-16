package com.jason.rpc.transport;

import com.jason.rpc.entity.RpcRequest;

public interface RpcClient {

    Object sendRequest(RpcRequest rpcRequest);

}
