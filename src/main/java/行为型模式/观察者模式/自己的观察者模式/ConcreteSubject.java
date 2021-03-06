package 行为型模式.观察者模式.自己的观察者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:39
 * @描述
 */
public class ConcreteSubject extends Subject {
    private int state;
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象(目标对象)值发生了变化，请通知所有的观察者
        this.notifyAllObservers();
    }
}
