package 行为型模式.中介者模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:16
 * @描述
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}
