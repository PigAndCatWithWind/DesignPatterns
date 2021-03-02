package 创建型模式.工厂模式.抽象工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:58
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        LowCarFactory lowCarFactory = new LowCarFactory();
        lowCarFactory.use();
        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        luxuryCarFactory.use();
    }
}
