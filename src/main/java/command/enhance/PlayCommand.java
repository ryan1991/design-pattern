package command.enhance;

/**
 * 具体命令角色类
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.play();
    }
}
