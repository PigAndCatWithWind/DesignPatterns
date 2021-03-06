package 行为型模式.中介者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:20
 * @描述
 */
public class Market implements Department {

    private Mediator mediator;  //持有中介者(总经理)的引用

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }


    public void outAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持！");
        mediator.command("finacial");

    }


    public void selfAction() {
        System.out.println("跑去接项目！");
    }

}
