package event;

public class StartingApplicationListener2 implements ApplicationListener<StartingEvent> {

    @Override
    public void onApplicationEvent(StartingEvent event) {
        System.out.println("do 2 when "+ event.getSource());
    }
}
