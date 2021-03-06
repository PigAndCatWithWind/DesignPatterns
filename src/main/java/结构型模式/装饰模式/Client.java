package 结构型模式.装饰模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:17
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能，飞行----------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("增加两个新的功能，飞行，水里游-------");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

    }
}
