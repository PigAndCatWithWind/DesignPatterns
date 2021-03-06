package 行为型模式.策略模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:51
 * @描述
 */
public class OldCustomerFewStrategy implements Strategy{
    public double getPrice(double standardPrice) {
        System.out.println("打八五折");
        return standardPrice*0.85;
    }
}
