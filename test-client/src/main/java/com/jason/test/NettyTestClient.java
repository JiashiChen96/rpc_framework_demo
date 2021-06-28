package com.jason.test;

import com.jason.rpc.api.HelloObject;
import com.jason.rpc.api.HelloService;
import com.jason.rpc.serializer.CommonSerializer;
import com.jason.rpc.transport.RpcClient;
import com.jason.rpc.transport.RpcClientProxy;
import com.jason.rpc.transport.netty.client.NettyClient;

public class NettyTestClient {
    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}

