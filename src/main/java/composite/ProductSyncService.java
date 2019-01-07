package composite;

public class ProductSyncService implements SyncService {

    public void sync(SyncRequest request) {
        System.out.println("同步产品信息");
        
    }
}
