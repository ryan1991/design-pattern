package visitor.dispatch.stat.better2;

/**
 * 访问者模式：数据结构与业务逻辑分离
 *      1.先写一个空的visitor接口，
 *      2.定义好数据类型（mouse, keyboard ..）,accept(visitor)
 *      3.根据不同的数据类型，在visitor中重载方法visitor(mouse),完善相应的业务逻辑
 *
 *      扩展时，需要新增数据类型和增加新的visit()方法
 *
 **/
public class Client {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        ComputerPart computer = new Monitor();
        computer.accept(visitor);

    }

}
