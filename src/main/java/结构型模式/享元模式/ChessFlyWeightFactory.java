package 结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:32
 * @描述
 */
public class ChessFlyWeightFactory {
    private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight  getChess(String color){

        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color, cfw);
            return cfw;
        }

    }
}
