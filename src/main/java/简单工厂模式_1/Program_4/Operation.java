package 简单工厂模式_1.Program_4;

/**
 * @Author: WangYao
 * @description: 运算类 采用继承的方法
 * @date: 2023-11-22 22:52
 */
public abstract class Operation {
    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public abstract double GetResult();
}
