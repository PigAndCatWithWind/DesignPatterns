package 行为型模式.观察者模式.自己的观察者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:41
 * @描述
 */
public class ObserverA implements Observer{
    private int myState;   //myState需要跟目标对象的state值保持一致！
    public void update(Subject subject) {
        myState =((ConcreteSubject) subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
