package command.enhance;

/**
 * 键盘(请求者)
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class Keypad {
    private Command playCommand;

    private Command rewindCommand;

    private Command stopCommand;


    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }


    public void play(){
        playCommand.execute();
    }

    public void remind(){
        rewindCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }

}
