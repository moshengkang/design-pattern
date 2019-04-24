package com.xiaokang.designPatterns.builder;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 16:37
 * @Description: 客户
 */
public class Client {
    public static void main(String[] args) {
        //招工，建别墅。
        Builder builder = new HouseBuilder();
        //交给工程总监
        Director director = new Director(builder);
        System.out.println(director.direct());
        //替换施工方，建公寓。
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
