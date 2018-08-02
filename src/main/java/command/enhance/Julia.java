package command.enhance;

/**
 * 朱莉小女孩（客户端角色）
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class Julia {

    public static void main(String[] args) {
        //创建接受者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        //测试
        keypad.play();
        keypad.remind();
        keypad.stop();
        keypad.play();
        keypad.stop();





    }


}
