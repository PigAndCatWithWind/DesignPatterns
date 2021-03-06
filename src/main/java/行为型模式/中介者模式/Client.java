package 行为型模式.中介者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:21
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new President();

        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Finacial finacial = new Finacial(mediator);

        development.selfAction();
        development.outAction();
    }
}
