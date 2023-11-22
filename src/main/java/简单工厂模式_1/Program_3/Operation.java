package 简单工厂模式_1.Program_3;

/**
 * @Author: WangYao
 * @description: 运算类
 * @date: 2023-11-22 22:43
 */
public class Operation {
    // 将运算和显示界面分开
    public static double GetResult(double numberA, double numberB, String operate) {
        double result = 0;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                if (numberB != 0) result = numberA / numberB;
                break;
            default:
                System.out.println("输入的运算符号有误");
        }
        return result;
    }
}
