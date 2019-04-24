package com.xiaokang.designPatterns.singleton;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/20 09:56
 * @Description: 单例模式--懒汉--同步方法内部
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
