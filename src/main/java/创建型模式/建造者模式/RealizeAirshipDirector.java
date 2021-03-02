package 创建型模式.建造者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午4:26
 * @描述
 */
public class RealizeAirshipDirector implements AirShipDirector {
    private AirShipBuilder airShipBuilder;
    public RealizeAirshipDirector(AirShipBuilder airShipBuilder){
        this.airShipBuilder = airShipBuilder;
    }
    public AirShip DirectAirShip() {
        Engine engine = airShipBuilder.builderEngine();
        OrbitalModule orbitalModule = airShipBuilder.builderOrbitalModule();
        EscapeTower escapeTower = airShipBuilder.builderEscapeTower();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
