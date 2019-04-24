package com.xiaokang.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/1/12 12:05
 * @Description: 动态代理模式（jdk）
 */
public class DynamicProxy {

    //抽象角色
    interface Man{
        public void say();
    }

    //真实角色
    class ManImpl implements Man{
        public void say() {
            System.out.println("************我是真实角色*********");
        }
    }

    //代理处理器
    class ManHandler implements InvocationHandler{
        private ManImpl man = new ManImpl();
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object object = null;
            object = method.invoke(man,args);//激活调用的方法
            return object;
        }
    }

    public static void main(String[] args) {
        ManHandler manHandler = new DynamicProxy().new ManHandler();
        Man man = (Man) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Man.class},manHandler);
        man.say();
    }
}
