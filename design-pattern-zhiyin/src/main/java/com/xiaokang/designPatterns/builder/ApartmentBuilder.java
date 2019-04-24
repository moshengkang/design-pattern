package com.xiaokang.designPatterns.builder;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 16:29
 * @Description: 高层公寓楼施工方
 */
public class ApartmentBuilder implements Builder {

    private Building apartment;

    public ApartmentBuilder() {
        apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("深挖地基，修建地下车库，部署管道、线缆、风道。");
        apartment.setBasement("╚═════════╝\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建多层建筑框架，建造电梯井，钢筋混凝土浇灌。");
        for (int i = 0; i < 8; i++) {// 此处假设固定8层
            apartment.setWall("║ □ □ □ □ ║\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("封顶，部署通风井，做防水层，保温层。");
        apartment.setRoof("╔═════════╗\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}
