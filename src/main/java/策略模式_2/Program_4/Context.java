package 策略模式_2.Program_4;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-23 0:59
 */
public class Context {

    Strategy strategy;

    /**
     *
     * 初始化时传入具体的策略对象
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象，调用其算法的方法
     */
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
