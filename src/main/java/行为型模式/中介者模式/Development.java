package 行为型模式.中介者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:18
 * @描述
 */
public class Development implements Department {

    private Mediator mediator;  //持有中介者(总经理)的引用

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("development", this);
    }


    public void outAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");
    }


    public void selfAction() {
        System.out.println("专心科研，开发项目！");
    }

}
