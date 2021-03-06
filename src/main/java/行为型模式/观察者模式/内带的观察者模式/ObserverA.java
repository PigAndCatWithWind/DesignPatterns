package 行为型模式.观察者模式.内带的观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:46
 * @描述
 */
public class ObserverA implements Observer {
    private int myState;


    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }


    public int getMyState() {
        return myState;
    }


    public void setMyState(int myState) {
        this.myState = myState;
    }
}
