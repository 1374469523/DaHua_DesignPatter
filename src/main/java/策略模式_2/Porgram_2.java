package 策略模式_2;

/**
 * @Author: WangYao
 * @description: 做一个商场收银软件，营业员根据客户所购买商品的单价和数量，向客户收费。
 * 增加打折的需求
 * @date: 2023-11-23 0:12
 */
public class Porgram_2 {
    // 计算总计
    double total = 0.0d;
    // 单价
    double price;

    // 数量
    Integer Num;


    private void btnOk_Click() {
        price = 2;
        Num = 3;

        打折 打 = 打折.打5折;
        //根据打折选择不同的单价 4个分支除了打折多少之外没有什么不同需要考虑重构
        switch (打) {
            case 正常收费:
                price = price;
                break;
            case 打8折:
                price = price * 0.8;
                break;
            case 打7折:
                price = price * 0.7;
                break;
            case 打5折:
                price = price * 0.5;
                break;
        }

        double totalPrices = price * Num;
        total = total + totalPrices;

        System.out.println("单价" + price + "每个" + Num + "个" + "总计：" + total);
    }
}

 enum 打折 {
    正常收费("正常收费"), 打8折("打8折"), 打7折("打7折"), 打5折("打5折"),
    ;
    String 折扣;

    打折(String 折扣) {
        this.折扣 = 折扣;
    }

    public String get折扣() {
        return 折扣;
    }

    public void set折扣(String 折扣) {
        this.折扣 = 折扣;
    }
}
