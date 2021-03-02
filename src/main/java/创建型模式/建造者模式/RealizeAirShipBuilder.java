package 创建型模式.建造者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午4:22
 * @描述
 */
public class RealizeAirShipBuilder implements AirShipBuilder {
    public Engine builderEngine() {
        System.out.println("Builder Engine");
        return new Engine("my engine");
    }

    public OrbitalModule builderOrbitalModule() {
        System.out.println("Builder OrbitalModule");
        return new OrbitalModule("my orbitalModule");
    }

    public EscapeTower builderEscapeTower() {
        System.out.println("Builder EscapeTower");
        return new EscapeTower("my escapeTower");
    }
}
