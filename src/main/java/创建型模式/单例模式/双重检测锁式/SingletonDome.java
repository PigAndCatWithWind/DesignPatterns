package 创建型模式.单例模式.双重检测锁式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午7:04
 * @描述
 */
public class SingletonDome {
    private static SingletonDome instance = null;
    private SingletonDome(){}
    public static SingletonDome getInstance(){
        if (instance == null){
            SingletonDome singletonDome;
            synchronized (SingletonDome.class){
                singletonDome = instance;
                if (singletonDome == null){
                    synchronized (SingletonDome.class){
                        if (singletonDome==null)
                            singletonDome = new SingletonDome();
                    }
                    instance = singletonDome;
                }
            }
        }
        return instance;
    }

}
