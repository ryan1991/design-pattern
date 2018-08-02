package visitor.dispatch.stat.better;

/**
 * 管理者
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class ManagerEmployee extends Employee {

    public ManagerEmployee(String name, int timeSheet, double wage, int punishmentTime) {
        super(name, timeSheet, wage, punishmentTime);
    }

    public void accept(Department department) {
        department.visit(this);
    }

    public int getTotalTimeSheet() {
        return getTimeSheet() * 22 - getPunishmentTime();
    }

    public double getTotalWage() {
        //管理人员 每迟到一次罚10
        return getWage() - getPunishmentTime() * 10;
    }
}
