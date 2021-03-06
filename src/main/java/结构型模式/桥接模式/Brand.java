package 结构型模式.桥接模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:05
 * @描述
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand {


    public void sale() {
        System.out.println("销售联想电脑");
    }

}

class Dell implements Brand {


    public void sale() {
        System.out.println("销售Dell电脑");
    }

}

class Shenzhou implements Brand {


    public void sale() {
        System.out.println("销售神舟电脑");
    }

}