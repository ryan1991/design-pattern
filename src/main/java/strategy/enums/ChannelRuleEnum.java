package strategy.enums;

/**
 * @author songjunbao
 * @date 2020-08-25
 */
public enum  ChannelRuleEnum {
    /**
     * 头条
     */
    TOUTIAO("TOUTIAO",new TouTiaoChannelRule()),
    /**
     * 腾讯
     */
    TENCENT("TENCENT",new TencentChannelRule()),
    ;

    private String name;

    private GeneralChannelRule channel;

    ChannelRuleEnum(String name, GeneralChannelRule channel) {
        this.name = name;
        this.channel = channel;
    }

    //匹配
    public static ChannelRuleEnum match(String name){
        ChannelRuleEnum[] values = ChannelRuleEnum.values();
        for (ChannelRuleEnum value : values) {
            if(value.name.equals(name)){
                return value;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public GeneralChannelRule getChannel() {
        return channel;
    }
}
