package 结构型模式.享元模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:30
 * @描述
 */
public class Coordinate {
    private int x,y;

    public Coordinate(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
