package 创建型模式.建造者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午4:20
 * @描述
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower  builderEscapeTower();
}
