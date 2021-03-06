package 结构型模式.桥接模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:06
 * @描述
 */
public class Computer {
    protected Brand brand;
    public Computer(Brand brand){
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
