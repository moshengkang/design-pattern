package com.xiaokang.designPatterns.adapter;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 14:50
 * @Description: 类适配器模式:类适配器模式，通过继承服务器一方的类，拥有了提供服务器服务的功能，同时又实现了客户端请求服务的接口，得以将客户端请求服务的功能，转嫁给服务器提供的服务。
 * Client 接口是客户端请求服务的接口，但是服务端提供服务的 Server 类，并不能跟客户端的请求相匹配。
 * 所以，就需要一个适配器类，继承 Server 类拥有 doEasyWork 的方法，然后再实现 Client 类，将父类的方
 * 法 doEasyWork 封装到 doWork 中，这就实现了客户端请求服务，与服务端提供服务接口不一致的情况。
 */
public class ClassAdapterPattern {

    /**
     * @Description: 客户端请求服务的外部接口
     * @auther: moshengkang
     * @date:   2019/2/11 14:53
     */
    interface Client{
        public void doWork();
    }

    /**
     * @Description: 服务端提供服务的类
     * @auther: moshengkang
     * @date:   2019/2/11 14:54
     */
    class Server{
        public void doEasyWork(){
            System.out.println("类适配器模式:"+"搬一块砖");
        }
    }

    /**
     * @Description: 适配器类
     * @auther: moshengkang
     * @date:   2019/2/11 14:56
     */
    class Adapter extends Server implements Client{
        @Override
        public void doWork() {
            super.doEasyWork();
        }
    }

    //测试
    public static void main(String[] args) {
        Adapter adapter = new ClassAdapterPattern().new Adapter();
        adapter.doWork();
    }
}
