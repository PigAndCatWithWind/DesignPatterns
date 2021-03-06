package 结构型模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午7:57
 * @描述
 */
public class StarHandler implements InvocationHandler {

    Star realStar;
    public StarHandler(Star realStar){
        this.realStar = realStar;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;

        System.out.println("真正的方法执行前！");
        System.out.println("面谈，签合同，预付款，订机票");

        if(method.getName().equals("sing")){
            object = method.invoke(realStar, args);
        }

        System.out.println("真正的方法执行后！");
        System.out.println("收尾款");
        return object;
    }
}
