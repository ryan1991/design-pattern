package init;

/**
 * @Author ryan.song
 * @Date 2019/4/24
 **/
public class StaticInits {

    static {
        //静态初始化
        doInit();
    }

    private static void doInit(){
        System.out.println("do init ...");
    }


    public static void run() {
        System.out.println("do run ...");
    }
}
