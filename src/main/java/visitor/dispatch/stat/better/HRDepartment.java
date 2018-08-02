package visitor.dispatch.stat.better;

/**
 * 财务部
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class HRDepartment extends Department {

    public void visit(ManagerEmployee me) {
        int totalTimeSheet = me.getTotalTimeSheet();
        System.out.println("管理者："+ me.getName()+
                ",迟到时数:"+me.getPunishmentTime() +
                "，总时长："+totalTimeSheet);

    }


    public void visit(GeneralEmployee ge) {
        int totalTimeSheet = ge.getTotalTimeSheet();
        System.out.println("普通员工："+ ge.getName()+
                ",迟到时数:"+ge.getPunishmentTime() +
                "，总时长："+totalTimeSheet);
    }
}
