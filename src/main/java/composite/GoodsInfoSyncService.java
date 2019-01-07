package composite;

public class GoodsInfoSyncService implements SyncService {

    public void sync(SyncRequest request) {
        System.out.println("同步商品信息");
    }
}
