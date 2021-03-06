package 结构型模式.外观模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:36
 * @描述
 */
public class RegisterFacade {
    public void register(){
        工商局  a = new 海淀区工商局();
        a.checkName();
        质检局 b = new 海淀质检局();
        b.orgCodeCertificate();
        税务局  c  = new 海淀税务局();
        c.taxCertificate();
        银行  d = new 中国工商银行();
        d.openAccount();
    }
}
