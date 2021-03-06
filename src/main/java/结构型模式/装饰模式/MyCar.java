package 结构型模式.装饰模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:13
 * @描述
 */
public interface MyCar {
    void move();
}
class Car implements MyCar{

    public void move() {
        System.out.println("陆地上跑！");
    }
}

class SuperCar implements MyCar{
    protected MyCar myCar;
    public SuperCar(MyCar myCar){
        this.myCar = myCar;
    }
    public void move() {
        myCar.move();
    }
}

class FlyCar extends SuperCar{
    public FlyCar(MyCar myCar){
        super(myCar);
    }
    public void fly(){
        System.out.println("天上飞！");
    }
    public void move(){
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar {

    public WaterCar(MyCar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上游！");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }

}

class AICar extends SuperCar {

    public AICar(MyCar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑！");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }

}