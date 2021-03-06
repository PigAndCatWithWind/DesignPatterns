package 行为型模式.观察者模式.内带的观察者模式;

import java.util.Observable;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:45
 * @描述
 */
public class ConcreteSubject extends Observable {
    private int state;

    public void set(int s){
        state = s;  //目标对象的状态发生了改变

        setChanged();  //表示目标对象已经做了更改
        notifyObservers(state);  //通知所有的观察者

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
