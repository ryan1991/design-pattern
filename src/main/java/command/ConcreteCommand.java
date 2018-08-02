package command;

/**
 * 具体命令类
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class ConcreteCommand implements Command{
    //依赖命令接受者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        //通常会转调接受者的相应方法，让接受者来执行功能
        receiver.action();
    }
}
