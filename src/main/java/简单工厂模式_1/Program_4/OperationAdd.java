package 简单工厂模式_1.Program_4;

/**
 * @Author: WangYao
 * @description: 实现operatek进行加法运算
 * @date: 2023-11-22 22:55
 */
public class OperationAdd extends Operation {
    @Override
    public double GetResult() {

        double result = 0;
        result = get_numberA() + get_numberB();
        return result;
    }
}
