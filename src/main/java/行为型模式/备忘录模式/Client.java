package 行为型模式.备忘录模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:09
 * @描述
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp("Jack",20,2000);
        System.out.println("one print : " + emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        careTaker.setMemento(emp.memento());

        emp.setAge(19);
        emp.setSalary(800);
        emp.setEname("emp");
        System.out.println("two print : " + emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(careTaker.getMemento());
        System.out.println("three print : " + emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }
}
