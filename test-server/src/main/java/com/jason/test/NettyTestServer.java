package com.jason.test;

import com.jason.rpc.api.HelloService;
import com.jason.rpc.serializer.KryoSerializer;
import com.jason.rpc.transport.netty.server.NettyServer;

public class NettyTestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        NettyServer server = new NettyServer("127.0.0.1", 9999);
        server.setSerializer(new KryoSerializer());
        server.publishService(helloService, HelloService.class);
    }
}

