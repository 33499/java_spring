package com.ysx.pojo.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        seeHouse();
        host.rent();

        subscribe();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void subscribe(){
        System.out.println("签租赁合同");
    }
    //收中介费
    public void fare(){
        System.out.println("收费");
    }
}
