package 创建型模式.单例模式.懒汉式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/1下午6:51
 * @描述
 * 懒汉式
 */
public class SingletonDome {

    private static SingletonDome instance;
    private SingletonDome(){};

    public static synchronized SingletonDome getInstance(){
        if (instance == null)
            instance = new SingletonDome();
        return instance;
    }
}
