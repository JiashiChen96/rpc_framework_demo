package com.jason.test;

import com.jason.rpc.api.HelloObject;
import com.jason.rpc.api.HelloService;
import com.jason.rpc.serializer.CommonSerializer;
import com.jason.rpc.transport.RpcClientProxy;
import com.jason.rpc.transport.socket.client.SocketClient;

public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
//        ByeService byeService = proxy.getProxy(ByeService.class);
//        System.out.println(byeService.bye("Netty"));
    }

}
