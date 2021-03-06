package 行为型模式.责任链模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:33
 * @描述
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<3){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
            System.out.println("主任："+this.name+",审批通过！");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
