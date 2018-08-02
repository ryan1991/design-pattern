package visitor.dispatch.stat.better;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class Client {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new ManagerEmployee("王总", 8 ,20000d, 10);
        Employee e2 = new ManagerEmployee("李经理", 8 ,18000d, 2);

        Employee e3 = new GeneralEmployee("小虎", 8 ,2000d, 20);
        Employee e4 = new GeneralEmployee("二蛋", 8 ,5000d, 11);
        Employee e5 = new GeneralEmployee("旺财", 8 ,8000, 1);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

//        Department dept = new FADepartment();
        Department dept = new HRDepartment();
        for(Employee e : employees){
            e.accept(dept);
        }


    }
}
