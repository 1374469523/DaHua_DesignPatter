package 简单工厂模式_1.Program_6;

/**
 * @Author: WangYao
 * @description: 鸟
 * @date: 2023-11-22 23:50
 */
public abstract class 鸟 extends 动物 {

    public String 羽毛;
    public String 有角质喙没有牙齿;

    private 翅膀 翅膀;

    @Override
    public void 新陈代谢(氧气 氧气, 水 水) {

    }

    @Override
    public void 繁殖() {

    }

    public 鸟() {
        翅膀 = new 翅膀();
    }

    public abstract void 下蛋();
}
