package strategy;

/**
 * 定义一系列算法，封装每个算法，并使它们可以互换。
 * 策略模式可以让算法独立于使用它的客户端。
 * Demo例子：业务是不同厂家的语音识别服务
 *
 **/
public class Client {
    public static void main(String[] args) {
//        SpeechService speechService = new SpeechServiceBaidu();
//        SpeechService speechService = new SpeechServiceAliyun();
        SpeechService speechService = new SpeechServiceKrypton();

        Context context = new Context();
        context.setSpeechService(speechService);
        context.processByte(new byte[]{});
    }


}
