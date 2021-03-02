package 创建型模式.工厂模式.抽象工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:52
 * @描述
 */
public class LuxurySeat implements Seat {
    public void seat() {
        System.out.println("this is luxury seat <---");
    }
}
