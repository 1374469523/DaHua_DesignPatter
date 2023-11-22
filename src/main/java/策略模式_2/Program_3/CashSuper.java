package 策略模式_2.Program_3;

/**
 * @Author: WangYao
 * @description: 现金收费抽象类
 * @date: 2023-11-23 0:30
 */
public abstract class CashSuper {
    /**
     * 现金收取超类的抽象方法，收取现金，参数为原价，返回为当前价格
     *
     * @param money
     * @return
     */
    public abstract double accepCash(double money);
}
