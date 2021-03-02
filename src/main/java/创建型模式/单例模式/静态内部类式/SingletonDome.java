package 创建型模式.单例模式.静态内部类式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午7:04
 * @描述
 */
public class SingletonDome {
    private static class SingletonClassInstance{
        private static final SingletonDome instance = new SingletonDome();
    }
    private SingletonDome(){}
    public static SingletonDome getInstance(){
        return SingletonClassInstance.instance;
    }

}
