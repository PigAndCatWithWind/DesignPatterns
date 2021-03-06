package 行为型模式.模板方法模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:48
 * @描述
 */
public abstract class BankTemplateMethod {
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact(); //办理具体的业务	//钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }



    public final void process(){	//模板方法！！！
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
