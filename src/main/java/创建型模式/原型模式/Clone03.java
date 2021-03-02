package 创建型模式.原型模式;

import java.io.*;
import java.util.Date;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午4:01
 * @描述
 */
public class Clone03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date(12312321331L);
        Sleep03 sleep03 = new Sleep03("prototype",date);

        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(arrayOutputStream);
        objectOutputStream.writeObject(sleep03);
        byte[] bytes = arrayOutputStream.toByteArray();

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
        //克隆好的对象！
        Sleep03 copySleep = (Sleep03) objectInputStream.readObject();

        System.out.println(sleep03);
        System.out.println(sleep03.getName()+" ---> "+sleep03.getBirthday());
        date.setTime(59874321569L);
        System.out.println("update time : "+sleep03.getBirthday());
        System.out.println(sleep03.getName()+" ---> "+sleep03.getBirthday());

        System.out.println(copySleep);
        copySleep.setName("copy sleep");
        System.out.println(copySleep.getName()+" ---> "+copySleep.getBirthday());
    }
}
