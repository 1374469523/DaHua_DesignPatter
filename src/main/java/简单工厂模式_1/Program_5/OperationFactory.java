package 简单工厂模式_1.Program_5;


import 简单工厂模式_1.Program_4.*;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-22 23:02
 */
public class OperationFactory {

    public static Operation createOperate(String operation) {
        Operation oper = null;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
