package adapters.typic;

/**
 * 电脑Hdmi接口
 */
public class PCHdmi implements Hdmi {

    private final Hdmi hdmi;

    public PCHdmi(Hdmi hdmi){
        this.hdmi = hdmi;
    }

    public void hdmi() {
        hdmi.hdmi();
    }
}
