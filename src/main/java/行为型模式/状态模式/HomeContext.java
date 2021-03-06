package 行为型模式.状态模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:56
 * @描述
 */
public class HomeContext {
    private State state;


    public void setState(State s){
        System.out.println("修改状态！");
        state = s;
        state.handle();
    }
}
