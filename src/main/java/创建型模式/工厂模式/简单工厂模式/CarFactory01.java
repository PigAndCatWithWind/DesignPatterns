package 创建型模式.工厂模式.简单工厂模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午8:36
 * @描述
 */
public class CarFactory01 {
    public static Car createCar(String type){
        if ("Audi".equals(type))
            return new Audi();
        else if ("Byd".equals(type))
            return new Byd();
        else
            return null;
    }
}
