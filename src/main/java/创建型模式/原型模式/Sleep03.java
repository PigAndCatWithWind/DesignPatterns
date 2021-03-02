package 创建型模式.原型模式;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/2下午3:37
 * @描述
 */
public class Sleep03 implements Serializable {
    private String name;
    private Date birthday;
    public Sleep03(String name, Date birthday){
        this.birthday = birthday;
        this.name = name;
    }
    public Sleep03(){}
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
