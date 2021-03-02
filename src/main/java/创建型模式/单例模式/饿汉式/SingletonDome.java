package 创建型模式.单例模式.饿汉式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午6:51
 * @描述
 * 饿汉式
 */
public class SingletonDome {
//    类初始化的时候，立即加载该对象。故天然的线程安全
    private static SingletonDome instance = new SingletonDome();
    private SingletonDome(){};
//    方法没有同步。调用效率高
    public SingletonDome getInstance(){return instance;}
}
