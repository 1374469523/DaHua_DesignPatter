package 策略模式_2.Program_5;

import 策略模式_2.Program_3.CashSuper;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-23 1:03
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double GetResult(double money) {
        return cashSuper.accepCash(money);
    }
}
