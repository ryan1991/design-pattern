package listener;

/**
 * 事件源
 *
 * @author songjunbao
 * @createdate 2018/1/2
 */
public class EventSource implements IEvent {
    private IEventListener eventListener;
    boolean button;
    boolean mouse;

    public void setEventListener(IEventListener arg) {
        eventListener = arg;
    }

    public boolean ClickButton() {
        return button;
    }

    public boolean MoveMouse() {
        return mouse;
    }

    public void mouseEventHappened(){
        mouse = true;
        eventListener.doEvent(this);
    }
}
