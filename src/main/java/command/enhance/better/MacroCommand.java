package command.enhance.better;

import command.enhance.Command;

/**
 * 增加宏命令
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public interface MacroCommand extends Command{

    //可以增加一个成员命令
    public void add(Command command);

    //可以删除一个成员命令
    public void remove(Command command);


}
