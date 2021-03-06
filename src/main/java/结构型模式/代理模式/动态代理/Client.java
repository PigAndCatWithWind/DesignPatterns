package 结构型模式.代理模式.动态代理;

import java.lang.reflect.Proxy;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:01
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class},starHandler);
        proxy.sing();
    }
}
