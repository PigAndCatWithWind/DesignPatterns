package 结构型模式.适配器模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:38
 * @描述
 */
public class Adapter02 implements Target{
    private Adaptee adaptee;
    public Adapter02(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void handleReq() {
        adaptee.request();
    }
}
