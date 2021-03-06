package 行为型模式.命令模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:28
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());
        Invoke i = new Invoke(c);
        i.call();


//		new Receiver().action();

    }
}
