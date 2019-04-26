package strategy;

/**
 * @Author ryan.song
 * @Date 2019/4/26
 **/
public class SpeechServiceAliyun implements SpeechService {
    @Override
    public String getText(byte[] voice) {
        return "阿里云语音识别结果";
    }
}
