package 行为型模式.迭代模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午9:28
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate concreteMyAggregate =
                new ConcreteMyAggregate();
        concreteMyAggregate.addObject("aa");
        concreteMyAggregate.addObject("bb");
        concreteMyAggregate.addObject("cc");
        MyIterator iterator = concreteMyAggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
