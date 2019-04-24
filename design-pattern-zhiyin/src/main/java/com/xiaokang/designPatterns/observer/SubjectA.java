package com.xiaokang.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/14 17:19
 * @Description: 被观察者A
 */
public class SubjectA implements Subject{

    public List<Observer> observers = new ArrayList<Observer>();

    public void update() {
        for (Observer observer :observers) {
            observer.say();
        }
    }
}
