package com.xiaokang.designPatterns.singleton;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/20 09:52
 * @Description: 单例--饿汉
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
