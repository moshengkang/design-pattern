package com.xiaokang.designPatterns.builder;

/**
 * @Auther: moshengkang
 * @e-mail: 1634414600@qq.com
 * @Date: 2019/2/11 16:21
 * @Description: 施工方接口
 */
public interface Builder {
    /**
     * @Description: 建造地基
     * @auther: moshengkang
     * @date:   2019/2/11 16:22
     */
    public void buildBasement();

    /**
     * @Description: 建造墙体
     * @auther: moshengkang
     * @date:   2019/2/11 16:22
     */
    public void buildWall();

    /**
     * @Description: 建造屋顶
     * @auther: moshengkang
     * @date:   2019/2/11 16:22
     */
    public void buildRoof();

    /**
     * @Description: 获取材料
     * @auther: moshengkang
     * @date:   2019/2/11 16:23
     */
    public Building getBuilding();
}
