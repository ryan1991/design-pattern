package listener;

/**
 * @author songjunbao
 * @createdate 2018/1/2
 */
public class Test {
    public static void main(String[] args) {
        EventSource m1 = new EventSource();
        EventSource2 m2 = new EventSource2();

        IEventListener listener = new IEventListener() {
            public void doEvent(IEvent e) {
                if (e.ClickButton()){
                    System.out.println("你点击了按钮");
                }
                if (e.MoveMouse()){
                    System.out.println("你移动了鼠标");
                }
            }
        };

        m1.setEventListener(listener);
        m1.mouseEventHappened();

        m2.setEventListener(listener);
        m2.buttonEventHappened();


    }

}
