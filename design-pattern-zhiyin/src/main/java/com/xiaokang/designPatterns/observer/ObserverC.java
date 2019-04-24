package com.xiaokang.designPatterns.observer;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/14 17:16
 * @Description: 具体观察者C
 */
public class ObserverC implements Observer{
    private String name;

    public ObserverC(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(name+"检测到了变化");
    }
}
