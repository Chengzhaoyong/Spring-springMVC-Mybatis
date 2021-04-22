package com.kuang.demo3;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理类
public class ProxyInvotationHandle  implements InvocationHandler {

    private rent rent;

    public void setRent(rent rent) {
        this.rent = rent;
    }

    //生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces()
                , this);
    }
    // proxy : 代理类 method : 代理类的调用处理程序的方法对象.
    // 处理代理实例上的方法调用并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("哈哈哈，我被代理了");
        Object result = method.invoke(rent, args);
        return result;
    }
}
