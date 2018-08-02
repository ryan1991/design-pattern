package visitor.dispatch.stat.better;

/**
 * 普通员工
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class GeneralEmployee extends Employee{

    public GeneralEmployee(String name, int timeSheet, double wage, int punishmentTime) {
        super(name, timeSheet, wage, punishmentTime);
    }

    public void accept(Department department) {
        department.visit(this);
    }

    public int getTotalTimeSheet() {
        return getTimeSheet() * 22 - getPunishmentTime();
    }

    public double getTotalWage() {
        return getWage() - getPunishmentTime() * 5 ;
    }
}
