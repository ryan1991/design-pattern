package command;

/**
 * 请求者（发布命令）
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class Invoker {

    //持有命令
    private Command command;


    public Invoker(Command command) {
        this.command = command;
    }


    //行动方法
    public void action(){
        command.execute();
    }


}


