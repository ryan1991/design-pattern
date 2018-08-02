package visitor.dispatch.stat.better;

/**
 * 公司员工(被访问者)
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public abstract class Employee {
    private String name;
    //每天上班时长
    private int timeSheet;

    private double wage;

    private int punishmentTime;


    public Employee(String name, int timeSheet, double wage, int punishmentTime) {
        this.name = name;
        this.timeSheet = timeSheet;
        this.wage = wage;
        this.punishmentTime = punishmentTime;
    }

    public abstract void accept(Department department);

    public abstract int getTotalTimeSheet();

    public abstract double getTotalWage();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(int timeSheet) {
        this.timeSheet = timeSheet;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPunishmentTime() {
        return punishmentTime;
    }

    public void setPunishmentTime(int punishmentTime) {
        this.punishmentTime = punishmentTime;
    }
}
