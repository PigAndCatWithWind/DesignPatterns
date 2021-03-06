package 结构型模式.外观模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:34
 * @描述
 */
public interface 税务局 {
    void taxCertificate();  //办理税务登记证
}
class 海淀税务局 implements 税务局 {


    public void taxCertificate() {
        System.out.println("在海淀税务局办理税务登记证！");
    }

}