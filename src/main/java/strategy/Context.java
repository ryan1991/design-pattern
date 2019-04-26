package strategy;

/**
 * @Author ryan.song
 * @Date 2019/4/26
 **/
public class Context {
    private SpeechService speechService;

    public void setSpeechService(SpeechService speechService) {
        this.speechService = speechService;
    }

    public void processByte(byte[] bytes){
        //打印
        System.out.println(speechService.getText(bytes));
    }

}
