package com.jason.test;

import com.jason.rpc.api.HelloService;
import com.jason.rpc.registry.DefaultServiceRegistry;
import com.jason.rpc.registry.ServiceRegistry;
import com.jason.rpc.transport.RpcServer;

public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }

}
