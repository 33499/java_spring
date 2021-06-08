package com.ysx.pojo.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理,中介帮房东租房子，带一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
