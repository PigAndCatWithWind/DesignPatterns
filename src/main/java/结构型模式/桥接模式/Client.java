package 结构型模式.桥接模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:08
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Laptop(new Lenovo());
        computer.sale();
    }
}
