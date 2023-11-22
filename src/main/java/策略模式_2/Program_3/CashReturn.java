package 策略模式_2.Program_3;

/**
 * @Author: WangYao
 * @description: 返回收费子类
 * @date: 2023-11-23 0:35
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    /**
     * 返回收费，初始化时候必须输入返利条件和返利值
     *
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double accepCash(double money) {
        double result = money;
        // 如果大于返利条件，则需要减去返利值
        if (money > moneyCondition) result = money - Math.floor(money / moneyCondition) * moneyReturn;
        return result;
    }
}
