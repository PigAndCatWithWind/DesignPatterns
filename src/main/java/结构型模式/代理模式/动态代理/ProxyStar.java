package 结构型模式.代理模式.动态代理;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:59
 * @描述
 */
public class ProxyStar implements Star {

    StarHandler starHandler;
    public ProxyStar(StarHandler starHandler){
        this.starHandler = starHandler;
    }

    public void confer() {

    }

    public void signContract() {

    }

    public void bookTicket() {

    }

    public void sing() {

    }

    public void collectMoney() {

    }
}
