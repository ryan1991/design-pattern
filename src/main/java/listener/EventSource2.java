package listener;

/**
 * 事件源2
 *
 * @author songjunbao
 * @createdate 2018/1/2
 */
public class EventSource2 implements IEvent {
    private IEventListener eventListener;
    boolean button;
    boolean mouse;


    public void setEventListener(IEventListener arg) {
        this.eventListener = arg;
    }

    public boolean ClickButton() {
        return button;
    }

    public boolean MoveMouse() {
        return mouse;
    }

    public void buttonEventHappened(){
        button = true;
        eventListener.doEvent(this);
    }
}
