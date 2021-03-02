package 创建型模式.建造者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午4:15
 * @描述
 * 发动机
 */
public class Engine {
    private String name ;
    public Engine(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
