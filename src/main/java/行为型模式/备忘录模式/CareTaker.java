package 行为型模式.备忘录模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:08
 * @描述
 */
public class CareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento(){
        return memento;
    }
    public void setMemento(EmpMemento memento){
        this.memento = memento;
    }
}
