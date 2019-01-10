package adapters.idio;

/**
 * Handler中有许多接口，
 * 但只对Handler接口的read（）方法感兴趣
 */
public class ReadHandler extends HandlerAdapter {

    @Override
    public void read() {
        System.out.println("just interest read");
    }
}
