package 行为型模式.迭代模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午9:20
 * @描述
 */
public interface MyIterator {
    void first();	//将游标指向第一个元素
    void next();	//将游标指向下一个元素
    boolean hasNext();//判断是否存在下一个元素
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();  //获取当前游标指向的对象

}
