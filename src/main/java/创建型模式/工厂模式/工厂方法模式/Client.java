package 创建型模式.工厂模式.工厂方法模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:45
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Car audi = new AudiFactory().create();
        Car byd = new BydFactory().create();
        audi.run();
        byd.run();
    }
}
