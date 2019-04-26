package strategy;

/**
 * @Author ryan.song
 * @Date 2019/4/26
 **/
public class SpeechServiceKrypton implements SpeechService {
    @Override
    public String getText(byte[] voice) {
        return "Krypton语音识别结果";
    }
}
