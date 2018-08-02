package command;

/**
 * 客户端
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class Client {

    public static void main(String[] args) {
        //创建接受者
        Receiver receiver = new Receiver();

        //创建命令
        Command command = new ConcreteCommand(receiver);

        //创建请者
        Invoker invoker = new Invoker(command);

        //执行方法
        invoker.action();




    }
}
