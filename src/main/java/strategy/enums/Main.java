package strategy.enums;

import java.util.Arrays;
import java.util.List;

/**
 * @author songjunbao
 * @date 2020-08-25
 */
public class Main {

    public static void main(String[] args) {
        /**
         * ChannelRule 是单例 只构造一次
         */
        System.out.println("枚举初始化" + ChannelRuleEnum.TENCENT.getName());

        List<String> channelNames = Arrays.asList("TOUTIAO", "TENCENT", "TOUTIAO");
        for (String channelName : channelNames){
            ChannelRuleEnum matched = ChannelRuleEnum.match(channelName);
            if (matched != null){
                GeneralChannelRule channel = matched.getChannel();
                channel.process();
            }
        }

    }
}
