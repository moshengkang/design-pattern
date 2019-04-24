package com.xiaokang.designPatterns.proxy;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/1/11 17:30
 * @Description: 静态代理模式
 */
public class StaticProxy {
    interface Man{
        public void say();
    }

    class ManImpl implements Man{
        public void say() {
            System.out.println("-----------我是真实角色-----------");
        }
    }

    class ManProxy implements Man{
        private ManImpl man = new ManImpl();
        public void say() {
            System.out.println("-----------我开始代理了------------");
            man.say();
        }
    }

    public static void main(String[] args) {
        ManProxy manProxy =new StaticProxy().new ManProxy();
        manProxy.say();
    }
}
