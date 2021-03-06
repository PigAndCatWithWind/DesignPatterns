package 行为型模式.状态模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:56
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        HomeContext homeContext = new HomeContext();
        homeContext.setState(new FreeState());
        homeContext.setState(new CheckedInState());
    }
}
