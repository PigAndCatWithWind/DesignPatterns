package 行为型模式.责任链模式;

/**
 * @创建人 PigAndCatWithWind
 * @创建时间 2021/3/6上午11:29
 * @描述
 */
public class LeaveRequest {
    private String empName;
    private int leaveDays;
    private String reason;


    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getLeaveDays() {
        return leaveDays;
    }
    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}
