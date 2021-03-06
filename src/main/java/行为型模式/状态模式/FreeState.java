package 行为型模式.状态模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:55
 * @描述
 */
public class FreeState implements State {


    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }

}
