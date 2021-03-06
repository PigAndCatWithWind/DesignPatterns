package 行为型模式.中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:21
 * @描述
 */
public class President implements Mediator {

    private Map<String,Department> map = new HashMap<String , Department>();


    public void command(String dname) {
        map.get(dname).selfAction();
    }


    public void register(String dname, Department d) {
        map.put(dname, d);
    }

}
