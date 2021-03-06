package com.ysx.pojo.demo03;

import com.ysx.pojo.demo03.ProxyInvocationHandler;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们需要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();//这里的proxy是动态生成的
        proxy.rent();
    }
}
