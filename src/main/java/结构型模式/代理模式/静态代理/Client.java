package 结构型模式.代理模式.静态代理;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:54
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Star reasl = new RealStar();
        Star proxy = new ProxyStar(reasl);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
