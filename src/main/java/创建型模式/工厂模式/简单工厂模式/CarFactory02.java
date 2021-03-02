package 创建型模式.工厂模式.简单工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:38
 * @描述
 */
public class CarFactory02 {
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }
}
