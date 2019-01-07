package composite;

import java.util.List;

public class CompositeSyncService implements SyncService {
    private List<SyncService> syncServices;

    public void setSyncServices(List<SyncService> syncServices){
        this.syncServices = syncServices;
    }

    public void sync(SyncRequest request) {
        for (SyncService service : syncServices){
            service.sync(request);
        }
    }



}
