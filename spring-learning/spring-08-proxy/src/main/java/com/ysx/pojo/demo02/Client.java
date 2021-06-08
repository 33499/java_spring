package com.ysx.pojo.demo02;

public class Client {
    public static void main(String[] args) {
       UserServiceImpl userService = new UserServiceImpl();
       UserServiceProxy proxy = new UserServiceProxy(userService);
       proxy.query();
    }
}
