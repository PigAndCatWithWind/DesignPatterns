package 行为型模式.备忘录模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:07
 * @描述
 */
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;


    public EmpMemento(Emp e) {
        this.ename = e.getEname();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }


    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
