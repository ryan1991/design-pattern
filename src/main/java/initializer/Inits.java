package initializer;

/**
 *
 *  初始化操作：参考SpringApplication
 *
 **/
public class Inits {

    public Inits(){
        doInit();
    }

    private void doInit(){
        System.out.println("do init ...");
    }


    public  void run(){
        System.out.println("do run ..");
    }

}
