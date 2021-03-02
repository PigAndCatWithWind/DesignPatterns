package 创建型模式.工厂模式.抽象工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:55
 * @描述
 */
public class LowCarFactory implements CarFactory{
    public void engine() {
        new LowEngine().engine();
    }

    public void seat() {
        new LowSeat().seat();
    }

    public void tyre() {
        new LowTyre().tyre();
    }

    public void use(){
        engine();
        seat();
        tyre();
    }
}
