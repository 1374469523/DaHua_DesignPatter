package 策略模式_2.Program_4;

/**
 * @Author: WangYao
 * @description: 客户端代码
 * @date: 2023-11-23 1:01
 */
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
