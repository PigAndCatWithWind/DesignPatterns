package 结构型模式.外观模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:37
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        new RegisterFacade().register();
    }
}
