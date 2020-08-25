package strategy.enums;

/**
 * @author songjunbao
 * @date 2020-08-25
 */
public class TencentChannelRule extends GeneralChannelRule {

    public TencentChannelRule(){
        System.out.println("Tencent construct");
    }

    @Override
    public void process() {
        System.out.println("Tencent process");
    }
}
