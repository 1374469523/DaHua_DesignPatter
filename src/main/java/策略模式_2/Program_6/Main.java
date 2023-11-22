package 策略模式_2.Program_6;

import 策略模式_2.Program_5.Price;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-23 1:24
 */
public class Main {
    public static void main(String[] args) {
        // 单价
        double price = 0;

        // 数量
        Integer Num = null;
        CashContext context = new CashContext(Price.打折);
        double totalPrices = 0d;
        totalPrices = context.GetResult(price * Num);
        System.out.println("单价" + price + "每个" + Num + "个" + "总计：" + totalPrices);
    }
}
