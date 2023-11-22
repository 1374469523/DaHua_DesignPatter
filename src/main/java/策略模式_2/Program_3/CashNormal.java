package 策略模式_2.Program_3;

/**
 * @Author: WangYao
 * @description: 正常收费子类
 * @date: 2023-11-23 0:32
 */
public class CashNormal extends CashSuper{
    @Override
    public double accepCash(double money) {
        return money;
    }
}
