package 结构型模式.适配器模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午6:43
 * @描述
 */
public class Adapter01 extends Adaptee implements Target {
    public void handleReq() {
        super.request();
    }
}
