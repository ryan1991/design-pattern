package event;

public class EndApplicationListener implements ApplicationListener<EndEvent> {

    @Override
    public void onApplicationEvent(EndEvent event) {
        System.out.println("do  when " + event.getSource());
    }
}
