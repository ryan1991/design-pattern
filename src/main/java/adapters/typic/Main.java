package adapters.typic;

/**
 * pc上的Hdmi接口 通过适配器 连接vga线显示器
 */
public class Main {
    public static void main(String[] args) {
        Hdmi hdmi = new PCHdmi(new Adapter(new Vga()));
        hdmi.hdmi();
    }
}
