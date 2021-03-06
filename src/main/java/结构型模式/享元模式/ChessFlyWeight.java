package 结构型模式.享元模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:31
 * @描述
 */
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }


    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"----"+c.getY());
    }


    public String getColor() {
        return color;
    }


    public void setColor(String c) {
        this.color = c;
    }

}

