package command.enhance.better;

import command.enhance.Command;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 收音机宏命令
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class MacroAudioCommand implements MacroCommand {
    private Set<Command> commands = new HashSet<Command>();


    //宏命令聚集
    public void add(Command command) {
        commands.add(command);
    }

    public void remove(Command command) {
        commands.remove(command);
    }

    public void execute() {
        for(Command cmd : commands){
            cmd.execute();
        }
    }
}
