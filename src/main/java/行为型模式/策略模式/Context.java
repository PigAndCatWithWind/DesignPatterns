package 行为型模式.策略模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:52
 * @描述
 */
public class Context {
    private Strategy strategy;	//当前采用的算法对象

    //可以通过构造器来注入
    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }
    //可以通过set方法来注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pringPrice(double s){
        System.out.println("您该报价："+strategy.getPrice(s));
    }
}
