package 简单工厂模式_1.Program_6;

/**
 * @Author: WangYao
 * @description: 动物
 * @date: 2023-11-22 23:41
 */
public abstract class 动物 {

    public String 有生命;

    /**
     * 新陈代谢
     *
     * @param 氧气 氧气
     * @param 水  水
     */
    public abstract void 新陈代谢(氧气 氧气, 水 水);

    /**
     * 繁殖
     */
    public abstract void 繁殖();
}
