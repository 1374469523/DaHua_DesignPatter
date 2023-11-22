package 策略模式_2.Program_5;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-23 1:21
 */
public enum Price {
    正常收费("正常收费"), 满300返100("满300返100"), 打折("打折"),
    ;
    String 折扣;

    Price(String 折扣) {
        this.折扣 = 折扣;
    }

    public String get折扣() {
        return 折扣;
    }

    public void set折扣(String 折扣) {
        this.折扣 = 折扣;
    }
}
