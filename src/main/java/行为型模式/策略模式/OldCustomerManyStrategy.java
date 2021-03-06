package 行为型模式.策略模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:52
 * @描述
 */
public class OldCustomerManyStrategy implements Strategy{
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice*0.8;
    }
}
