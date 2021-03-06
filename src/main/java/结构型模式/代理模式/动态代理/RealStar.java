package 结构型模式.代理模式.动态代理;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:52
 * @描述
 */
public class RealStar implements Star {

    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }


    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }


    public void confer() {
        System.out.println("RealStar.confer()");
    }


    public void signContract() {
        System.out.println("RealStar.signContract()");
    }


    public void sing() {
        System.out.println("RealStar(周杰伦本人).sing()");
    }
}
