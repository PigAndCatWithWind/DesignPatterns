package 创建型模式.工厂模式.简单工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:39
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Car audi = CarFactory01.createCar("Audi");
        Car byd = CarFactory01.createCar("Byd");
        audi.run();
        byd.run();

        audi = CarFactory02.createAudi();
        byd = CarFactory02.createByd();
        audi.run();
        byd.run();
    }
}
