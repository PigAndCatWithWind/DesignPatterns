package 结构型模式.代理模式.静态代理;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:53
 * @描述
 */
public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        super();
        this.star = star;
    }


    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }


    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }


    public void confer() {
        System.out.println("ProxyStar.confer()");
    }


    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }


    public void sing() {
        star.sing();
    }
}
