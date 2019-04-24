package com.xiaokang.designPatterns.singleton;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/20 09:44
 * @Description: 单例模式--懒汉--同步方法
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){

    }

    public static synchronized Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
