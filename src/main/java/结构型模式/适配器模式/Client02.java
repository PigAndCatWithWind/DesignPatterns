package 结构型模式.适配器模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:40
 * @描述
 */
public class Client02 {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter02(adaptee);
        target.handleReq();


    }
}
