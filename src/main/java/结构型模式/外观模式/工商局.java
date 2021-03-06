package 结构型模式.外观模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:34
 * @描述
 */
public interface 工商局 {
    void checkName();  //核名
}
class 海淀区工商局 implements 工商局 {


    public void checkName() {
        System.out.println("检查名字是否有冲突！");
    }

}

