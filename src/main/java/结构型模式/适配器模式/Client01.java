package 结构型模式.适配器模式;


/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午6:45
 * @描述
 */
public class Client01 {
    public static void RTarfet(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client01 client01 = new Client01();
        Target target = new Adapter01();
        client01.RTarfet(target);
    }
}
