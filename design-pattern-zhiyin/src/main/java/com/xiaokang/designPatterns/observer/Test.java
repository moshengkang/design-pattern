package com.xiaokang.designPatterns.observer;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/14 17:23
 * @Description: 测试观察者模式
 */
public class Test {
    public static void main(String[] args) {
        //创建观察者
        Observer observerA = new ObserverA("观察者A");
        Observer observerB = new ObserverA("观察者B");
        Observer observerC = new ObserverA("观察者C");
        //创建被观察者
        SubjectA subjectA = new SubjectA();
        subjectA.observers.add(observerA);
        subjectA.observers.add(observerB);
        subjectA.observers.add(observerC);
        subjectA.update();
    }
}
