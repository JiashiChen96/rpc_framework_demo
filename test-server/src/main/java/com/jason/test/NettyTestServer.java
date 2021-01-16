package com.jason.test;

import com.jason.rpc.api.HelloService;
import com.jason.rpc.registry.DefaultServiceRegistry;
import com.jason.rpc.registry.ServiceRegistry;
import com.jason.rpc.transport.netty.server.NettyServer;

public class NettyTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }

}
