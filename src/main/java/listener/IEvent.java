package listener;

/**
 * 事件
 *
 *
 * @author songjunbao
 * @createdate 2017/12/28
 */
public interface IEvent {

    void setEventListener(IEventListener arg);

    boolean ClickButton();

    boolean MoveMouse();
}
