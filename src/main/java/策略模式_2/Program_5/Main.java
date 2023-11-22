package 策略模式_2.Program_5;

import 策略模式_2.Program_3.CashNormal;
import 策略模式_2.Program_3.CashRebate;
import 策略模式_2.Program_3.CashReturn;

/**
 * @Author: WangYao
 * @description: 客户端
 * @date: 2023-11-23 1:04
 */
public class Main {
    public static void main(String[] args) {
        CashContext context;
        Price 打 = Price.正常收费;
        // 根据打折选择不同的单价 4个分支除了打折多少之外没有什么不同需要考虑重构
        switch (打) {
            case 正常收费:
                context = new CashContext(new CashNormal());
                break;
            case 满300返100:
                context = new CashContext(new CashReturn(30, 100));
                break;
            case 打折:
                context = new CashContext(new CashRebate(0.8));
                break;
        }
    }
}


