package 结构型模式.外观模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:36
 * @描述
 */
public interface 银行 {
    void  openAccount();  //开户
}
class 中国工商银行 implements 银行 {


    public void openAccount() {
        System.out.println("在中国工商银行开户！");
    }

}
