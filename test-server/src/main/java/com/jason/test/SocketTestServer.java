package com.jason.test;

import com.jason.rpc.annotation.ServiceScan;
import com.jason.rpc.serializer.CommonSerializer;
import com.jason.rpc.transport.RpcServer;
import com.jason.rpc.transport.socket.server.SocketServer;

@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.KRYO_SERIALIZER);
        server.start();
    }

}
