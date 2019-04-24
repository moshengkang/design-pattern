package com.xiaokang.designPatterns.singleton;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/20 09:47
 * @Description: 测试单例
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton1 singleton = Singleton1.getInstance();
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println("懒汉--同步方法："+singleton);
        System.out.println("懒汉--同步方法："+singleton1);
        System.out.println("==========================");
        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();
        System.out.println("饿汉："+singleton3);
        System.out.println("饿汉："+singleton4);
        System.out.println("==========================");
        Singleton3 singleton5 = Singleton3.getInstance();
        Singleton3 singleton6 = Singleton3.getInstance();
        System.out.println("懒汉--同步方法内部："+singleton5);
        System.out.println("懒汉--同步方法内部："+singleton6);
    }
}
