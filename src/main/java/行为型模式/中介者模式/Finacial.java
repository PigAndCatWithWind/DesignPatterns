package 行为型模式.中介者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:17
 * @描述
 */
public class Finacial implements Department {
    private Mediator mediator;//持有中介者(总经理)的引用
    public Finacial(Mediator mediator){
        this.mediator = mediator;
    }
    public void selfAction() {
        System.out.println("数钱！");
    }

    public void outAction() {
        System.out.println("汇报工作！没钱了，钱太多了！怎么花?");
    }
}
