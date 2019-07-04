package event;

public interface ApplicationEventMulticaster {

    void addListener(ApplicationEvent event, ApplicationListener listener);

    void multicastEvent(ApplicationEvent event);

}
