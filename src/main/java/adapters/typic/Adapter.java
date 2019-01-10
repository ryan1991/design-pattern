package adapters.typic;

/**
 * vgd转hdmi适配器
 */
public class Adapter implements Hdmi {

    private Vga vga;

    public Adapter(Vga vga){
        this.vga = vga;
    }

    public void hdmi() {
        vga.vga();
    }
}
