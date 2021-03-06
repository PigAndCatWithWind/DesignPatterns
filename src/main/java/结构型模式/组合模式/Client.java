package 结构型模式.组合模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:29
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5;
        Folder f1 = new Folder("我的收藏");

        f2 = new ImageFile("老高的大头像.jpg");
        f3 = new TextFile("Hello.txt");
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();
    }
}
