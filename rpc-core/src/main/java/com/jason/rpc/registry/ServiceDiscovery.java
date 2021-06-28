package com.jason.rpc.registry;

import java.net.InetSocketAddress;

public interface ServiceDiscovery {

    /**
     * 发现服务供应商地址
     * @param serviceName 服务名称
     * @return
     */
    InetSocketAddress lookupService(String serviceName);

}
