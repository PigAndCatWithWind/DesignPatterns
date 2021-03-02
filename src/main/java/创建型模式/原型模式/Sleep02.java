package 创建型模式.原型模式;

import java.util.Date;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午3:37
 * @描述
 */
public class Sleep02 implements Cloneable{
    private String name;
    private Date birthday;
    public Sleep02(String name, Date birthday){
        this.birthday = birthday;
        this.name = name;
    }
    public Sleep02(){}
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Object object = super.clone();
        //添加如下代码实现深复制(deep Clone)
        Sleep02 sleep02 = (Sleep02) object;
        //把属性也进行克隆！
        sleep02.birthday = (Date) this.birthday.clone();
        return object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
