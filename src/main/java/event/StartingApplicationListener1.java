package event;

public class StartingApplicationListener1 implements ApplicationListener<StartingEvent> {

    @Override
    public void onApplicationEvent(StartingEvent event) {
        System.out.println("do 1 when " + event.getSource());
    }
}
