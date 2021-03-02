package 创建型模式.原型模式;

import java.util.Date;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午3:46
 * @描述
 */
public class Clone01 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(12312321331L);
        Sleep01 sleep01 = new Sleep01("prototype",date);
        Sleep01 copysleep = (Sleep01) sleep01.clone();
        System.out.println(sleep01);
        System.out.println(sleep01.getName()+" ---> "+sleep01.getBirthday());
        date.setTime(23432432423L);
        System.out.println("update time : "+sleep01.getBirthday());
        System.out.println(sleep01.getName()+" ---> "+sleep01.getBirthday());

        copysleep.setName("copy sleep");
        System.out.println(copysleep);
        System.out.println(copysleep.getName()+" ---> "+copysleep.getBirthday());
    }
}
