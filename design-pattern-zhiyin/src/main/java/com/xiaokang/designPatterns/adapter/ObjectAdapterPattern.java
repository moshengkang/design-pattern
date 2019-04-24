package com.xiaokang.designPatterns.adapter;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 15:07
 * @Description: 对象适配器模式:对象适配器模式中，我们将服务端提供服务的类对象内置于适配器类中，直接在其中获取服务端提供的服务。
 * 适配器类Adapter不在继承服务端提供服务的类（Server）了，而是将服务类，直接内置于适配器类中，直接获取服务。
 */
public class ObjectAdapterPattern {
    /**
     * @Description: 客户端请求服务的外部接口
     * @auther: moshengkang
     * @date:   2019/2/11 15:10
     */
    interface Cilent{
        public void doWork();
    }

    /**
     * @Description: 服务端提供服务的类
     * @auther: moshengkang
     * @date:   2019/2/11 15:11
     */
    class Server{
        public void doEasyWork(){
            System.out.println("对象适配器模式:"+"搬一块砖");
        }
    }

    /**
     * @Description: 适配器类
     * @auther: moshengkang
     * @date:   2019/2/11 15:12
     */
    class Adapter implements Cilent{
        private Server server = new Server();
        @Override
        public void doWork() {
            server.doEasyWork();
        }
    }

    //测试
    public static void main(String[] args) {
        Adapter adapter = new ObjectAdapterPattern().new Adapter();
        adapter.doWork();
    }
}
