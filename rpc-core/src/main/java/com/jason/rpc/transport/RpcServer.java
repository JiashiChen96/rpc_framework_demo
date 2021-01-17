package com.jason.rpc.transport;

import com.jason.rpc.serializer.CommonSerializer;

public interface RpcServer {

    void start();

    void setSerializer(CommonSerializer serializer);

    <T> void publishService(Object service, Class<T> serviceClass);

}
