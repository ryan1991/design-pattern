package visitor.dispatch.stat.better;

/**
 * 财务部
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class FADepartment extends Department {

    public void visit(ManagerEmployee me) {
        double totalWage = me.getTotalWage();
        System.out.println("管理者："+ me.getName()+"固定工资：" + me.getTotalWage()+
                ",迟到时数:"+me.getPunishmentTime() +
                "，实发工资："+totalWage);

    }


    public void visit(GeneralEmployee ge) {
        double totalWage = ge.getTotalWage();
        System.out.println("普通员工："+ ge.getName()+"固定工资：" + ge.getTotalWage()+
                ",迟到时数:"+ge.getPunishmentTime() +
                "，实发工资："+totalWage);
    }
}
