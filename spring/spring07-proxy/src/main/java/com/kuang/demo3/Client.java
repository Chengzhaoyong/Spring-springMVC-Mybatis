package com.kuang.demo3;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host= new Host();
        //代理角色
        ProxyInvotationHandle proxyInvotationHandle = new ProxyInvotationHandle();
        proxyInvotationHandle.setRent(host);
        rent proxy = (rent) proxyInvotationHandle.getProxy();
        proxy.rent();

    }
}
