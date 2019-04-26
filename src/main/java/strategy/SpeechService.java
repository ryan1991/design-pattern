package strategy;

/**
 * @Author ryan.song
 * @Date 2019/4/26
 **/
public interface SpeechService {
    /**
     * 语音识别
     * @param voice
     * @return
     */
    String getText(byte[] voice);

}
