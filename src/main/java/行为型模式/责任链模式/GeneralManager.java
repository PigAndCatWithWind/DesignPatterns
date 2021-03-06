package 行为型模式.责任链模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:32
 * @描述
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<30){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
            System.out.println("总经理："+this.name+",审批通过！");
        }else{
            System.out.println("莫非"+request.getEmpName()+"想辞职，居然请假"+request.getLeaveDays()+"天！");
        }
    }
}
