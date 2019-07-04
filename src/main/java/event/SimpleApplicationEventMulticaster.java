package event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件广播器
 */
public class SimpleApplicationEventMulticaster implements ApplicationEventMulticaster {

    private Map<ApplicationEvent, List<ApplicationListener<?>>> smartListeners = new HashMap<>();


    @Override
    public void addListener(ApplicationEvent event, ApplicationListener listener) {
        if (smartListeners.containsKey(event)){
            smartListeners.get(event).add(listener);

        }else{
            List<ApplicationListener<?>> news = new ArrayList<>();
            news.add(listener);
            smartListeners.put(event, news);
        }

    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        List<ApplicationListener<?>> listeners = smartListeners.get(event);

        for (ApplicationListener listener : listeners){
            listener.onApplicationEvent(event);
        }

    }
}
