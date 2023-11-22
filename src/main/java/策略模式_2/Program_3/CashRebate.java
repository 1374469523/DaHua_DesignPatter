package 策略模式_2.Program_3;

/**
 * @Author: WangYao
 * @description: 打折收费子类
 * @date: 2023-11-23 0:34
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double accepCash(double money) {
        return money * moneyRebate;
    }
}
