package com.ysx.pojo.demo04;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        log(method.getName());
        //动态代理的本质，就是使用反射机制实现
        Object result =method.invoke(target, args);

        return result;
    }
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
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
