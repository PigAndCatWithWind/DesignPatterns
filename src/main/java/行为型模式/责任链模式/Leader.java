package 行为型模式.责任链模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:29
 * @描述
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; //责任链上的后继对象

    public Leader(String name) {
        super();
        this.name = name;
    }

    //设定责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }


    /**
     * 处理请求的核心的业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);



}
