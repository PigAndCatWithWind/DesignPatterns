package 创建型模式.工厂模式.抽象工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:57
 * @描述
 */
public class LuxuryCarFactory implements CarFactory{
    public void engine() {
        new LuxuryEngine().engine();
    }

    public void seat() {
        new LuxurySeat().seat();
    }

    public void tyre() {
        new LuxuryTyre().tyre();
    }
    public void use(){
        engine();
        seat();
        tyre();
    }
}
