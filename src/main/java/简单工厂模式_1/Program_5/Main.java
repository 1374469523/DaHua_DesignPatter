package 简单工厂模式_1.Program_5;

import 简单工厂模式_1.Program_4.Operation;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-22 23:05
 */
public class Main {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.set_numberA(1);
        operate.set_numberB(2);
        double result = operate.GetResult();
        System.out.println("result = " + result);
    }
}
