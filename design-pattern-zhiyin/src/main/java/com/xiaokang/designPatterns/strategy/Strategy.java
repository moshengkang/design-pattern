package com.xiaokang.designPatterns.strategy;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/27 14:33
 * @Description: 策略模式
 * Man接口，就是我们上层抽象出的算法，ManA，ManB，ManC则是具体算法的实现。
 * 所谓的策略，就是我们不同的算法实现。我们定义统一的算法接口，那么在系统的使用中，
 * 我们就可以在这个接口下动态的实现算法的切换，体现了对算法实现的策略。
 */
public class Strategy {

    interface Man{
        public void say();
    }

    //具体策略A
    class ManA implements Man{
        @Override
        public void say() {
            System.out.println("A策略生效");
        }
    }

    //具体策略B
    class ManB implements Man{
        @Override
        public void say() {
            System.out.println("B策略生效");
        }
    }

    //具体策略C
    class ManC implements Man{
        @Override
        public void say() {
            System.out.println("C策略生效");
        }
    }

    //调用策略
    class Woman{
        private Man man;

        public Woman(Man man) {
            this.man = man;
        }

        public void doWork(){
            man.say();
        }
    }

    public static void main(String[] args) {
        Woman woman;
        woman = new Strategy().new Woman(new Strategy().new ManA());
        woman.doWork();
        woman = new Strategy().new Woman(new Strategy().new ManB());
        woman.doWork();
        woman = new Strategy().new Woman(new Strategy().new ManC());
        woman.doWork();
    }
}
