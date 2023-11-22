package 策略模式_2.Program_6;

import 策略模式_2.Program_3.CashNormal;
import 策略模式_2.Program_3.CashRebate;
import 策略模式_2.Program_3.CashReturn;
import 策略模式_2.Program_3.CashSuper;
import 策略模式_2.Program_5.Price;

/**
 * @Author: WangYao
 * @description: 策略模式和工厂模式结合
 * @date: 2023-11-23 1:20
 */
public class CashContext {
    CashSuper cashSuper = null;

    /**
     *
     * @param price 传入的是收费的类型
     */
    public CashContext(Price price) {
        switch (price) {
            case 正常收费:
                cashSuper = new CashNormal();
                break;
            case 满300返100:
                cashSuper = new CashReturn(300, 100);
                break;
            case 打折:
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double GetResult(double money) {
        return cashSuper.accepCash(money);
    }
}
