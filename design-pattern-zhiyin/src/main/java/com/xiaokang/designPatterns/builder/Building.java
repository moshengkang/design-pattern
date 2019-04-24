package com.xiaokang.designPatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 16:13
 * @Description: 建筑物
 */
public class Building {
    //用来模拟房子组件的堆叠
    private List<String> buildingComponents = new ArrayList<>();

    //地基
    public void setBasement(String basement){
        this.buildingComponents.add(basement);
    }

    //墙体
    public void setWall(String wall){
        this.buildingComponents.add(wall);
    }

    //屋顶
    public void setRoof(String roof){
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        String buildingStr = "";
        for (int i = buildingComponents.size() - 1; i >= 0; i--) {
               buildingStr += buildingComponents.get(i);
        }
        return buildingStr;
    }
}
