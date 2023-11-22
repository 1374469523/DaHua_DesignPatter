package 策略模式_2;

/**
 * @Author: WangYao
 * @description: 做一个商场收银软件，营业员根据客户所购买商品的单价和数量，向客户收费。
 * @date: 2023-11-23 0:12
 */
public class Porgram_1 {
    // 计算总计
    double total = 0.0d;
    // 单价
    double price;

    // 数量
    Integer Num;


    private void btnOk_Click() {
        price = 2;
        Num = 3;
        double totalPrices = price * Num;
        total = total + totalPrices;

        System.out.println("单价" + price + "每个" + Num + "个" + "总计：" + total);
    }
}
