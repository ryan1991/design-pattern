package strategy.enums;

/**
 * @author songjunbao
 * @date 2020-08-25
 */
public class TouTiaoChannelRule extends GeneralChannelRule {

    public TouTiaoChannelRule(){
        System.out.println("TouTiao construct");
    }

    @Override
    public void process() {
        System.out.println("TouTiao process");

    }
}
