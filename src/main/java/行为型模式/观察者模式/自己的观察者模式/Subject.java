package 行为型模式.观察者模式.自己的观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:39
 * @描述
 */
public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }
    public void removeObserver(Observer obs){
        list.add(obs);
    }

    //通知所有的观察者更新状态
    public void notifyAllObservers(){
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}
