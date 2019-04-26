package strategy;

/**
 * @Author ryan.song
 * @Date 2019/4/26
 **/
public class SpeechServiceBaidu implements SpeechService {
    @Override
    public String getText(byte[] voice) {
        return "百度语音识别结果";
    }
}
