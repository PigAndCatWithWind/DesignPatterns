package 结构型模式.组合模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/5下午8:24
 * @描述
 */
public interface Component {
    void operation();
}

//叶子组件
interface Leaf extends Component {
}
//容器组件
interface Composite extends Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}