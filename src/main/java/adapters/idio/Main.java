package adapters.idio;

/**
 * 这是适配器模式一种常用的用法，用于一个接口有许多方法，但我们通常只对其中部分方法感兴趣，
 * 不想额外实现这个接口的不必要的方法，通常需要一个Adapter实现该接口，并提供默认的实现，即使是空实现。
 */
public class Main {
    public static void main(String[] args) {

        Handler handler = new ReadHandler();
        //调用read()
        handler.read();
    }

}
