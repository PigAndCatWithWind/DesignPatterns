package 创建型模式.原型模式;

import java.util.Date;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午3:55
 * @描述
 */
public class Clone02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(12312321331L);
        Sleep02 sleep02 = new Sleep02("prototype",date);
        Sleep02 copySleep = (Sleep02) sleep02.clone();
        System.out.println(sleep02);
        System.out.println(sleep02.getName()+" ---> "+sleep02.getBirthday());
        date.setTime(99312321331L);
        System.out.println("update time : " +sleep02.getBirthday());
        System.out.println(sleep02.getName()+" ---> "+sleep02.getBirthday());

        copySleep.setName("copy sleep");
        System.out.println(copySleep);
        System.out.println(copySleep.getName()+" ---> "+copySleep.getBirthday());
    }
}
