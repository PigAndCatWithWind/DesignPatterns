package 行为型模式.策略模式;

import 行为型模式.观察者模式.内带的观察者模式.ConcreteSubject;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:53
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new OldCustomerManyStrategy();
        Context context = new Context(strategy);

        context.pringPrice(987);
    }
}
