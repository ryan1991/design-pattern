package visitor.dispatch.stat.better;

/**
 * 部门(访问者)
 *  重载visit方法
 * @author songjunbao
 * @createdate 2018/1/21
 */
public abstract class Department {


    public abstract void visit(ManagerEmployee me);

    public abstract void visit(GeneralEmployee ge);

}
