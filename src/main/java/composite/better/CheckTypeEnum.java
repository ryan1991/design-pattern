package composite.better;

/**
 * 审核类型
 **/
public enum CheckTypeEnum {
    LABEL(0),
    AI(1),
    RISK(2);

    private int value;

    CheckTypeEnum(int value){
        this.value = value;
    }

}
