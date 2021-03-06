package 结构型模式.外观模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:35
 * @描述
 */
public interface 质检局 {
    void  orgCodeCertificate();  //办理组织机构代码证
}

class 海淀质检局 implements 质检局 {


    public void orgCodeCertificate() {
        System.out.println("在海淀区质检局办理组织机构代码证！");
    }

}