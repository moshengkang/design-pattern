package com.xiaokang.designPatterns.adapter;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 15:18
 * @Description: 缺省适配器模式:缺省适配器模式中，如果我们的适配器类不想实现外部接口定义的所有的方法的时候，那么可以在适配器类与接口之间创建一个抽象类，由抽象类去平庸化接口中的方法。
 * 在客户端请求服务的接口Client与适配器类Adapter中间创建一个抽象类，抽象类去实现不希望适配器实现的功能，那么我们的适配器的功能就变得更具有目标性。
 */
public class DefaultAdapterPattern {
    /**
     * @Description: 客户端请求服务的外部接口
     * @auther: moshengkang
     * @date:   2019/2/11 15:27
     */
    interface Client {
        public void doWork();
        public void eat();
        public void say();
    }

    /**
     * @Description: 客户端接口抽象类
     * @auther: moshengkang
     * @date:   2019/2/11 15:29
     */
    abstract class AbstractClient implements Client {
        @Override
        public void doWork() {

        }

        @Override
        public void eat() {

        }

        @Override
        public void say() {

        }
    }

    /**
     * @Description: 服务端提供服务的类
     * @auther: moshengkang
     * @date:   2019/2/11 15:31
     */
    class Server {
        public void doEasyWork(){
            System.out.println("缺省适配器模式:"+"搬一块砖");
        }
    }

    /**
     * @Description: 适配器类
     * @auther: moshengkang
     * @date:   2019/2/11 15:32
     */
    class Adapter extends AbstractClient{
        private Server server = new Server();
        @Override
        public void doWork() {
            server.doEasyWork();
        }
    }

    //测试
    public static void main(String[] args) {
        Adapter adapter = new DefaultAdapterPattern().new Adapter();
        adapter.doWork();
    }
}
