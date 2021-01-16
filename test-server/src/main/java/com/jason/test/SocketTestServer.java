package com.jason.test;

import com.jason.rpc.api.HelloService;
import com.jason.rpc.registry.DefaultServiceRegistry;
import com.jason.rpc.registry.ServiceRegistry;
import com.jason.rpc.transport.socket.server.SocketServer;

public class SocketTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        SocketServer rpcServer = new SocketServer(serviceRegistry);
        rpcServer.start(9000);
    }

}
