package event;

/**
 * 简单模拟Spring的事件机制
 */
public class Publisher {

    public static void main(String[] args) throws Exception{

        ApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        ApplicationEvent startEvent = new StartingEvent("starting");
        ApplicationEvent endEvent = new EndEvent("end");

        multicaster.addListener(startEvent, new StartingApplicationListener1());
        multicaster.addListener(startEvent, new StartingApplicationListener2());
        multicaster.addListener(endEvent, new EndApplicationListener());

        multicaster.multicastEvent(startEvent);
        Thread.sleep(10000L);

        multicaster.multicastEvent(endEvent);

    }

}
