package 行为型模式.责任链模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:30
 * @描述
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
            System.out.println("经理："+this.name+",审批通过！");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
