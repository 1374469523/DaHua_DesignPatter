package 简单工厂模式_1.Program_4;

/**
 * @Author: WangYao
 * @description: 除法运算
 * @date: 2023-11-22 22:55
 */
public class OperationDiv extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        if (get_numberB() != 0) result = get_numberA() / get_numberB();
        else throw new RuntimeException("除数不能为0");
        return result;
    }
}
