package com.xiaokang.designPatterns.observer;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/14 17:14
 * @Description: 具体观察者B
 */
public class ObserverB implements Observer{
    private String name;

    public ObserverB(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(name+"检测到了变化");
    }
}
