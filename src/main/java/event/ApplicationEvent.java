package event;

import java.util.EventObject;

public abstract class ApplicationEvent extends EventObject {

    private long timestamp;

    public ApplicationEvent(Object source){
        super(source);
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp(){
        return timestamp;
    }

}
