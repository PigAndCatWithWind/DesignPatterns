package 创建型模式.建造者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午4:29
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector airShipDirector =
                new RealizeAirshipDirector(new RealizeAirShipBuilder());
        AirShip airShip = airShipDirector.DirectAirShip();
        System.out.println(airShip.getEngine().getName());
        airShip.launch();
    }
}
