package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 适合将复杂的，且繁琐的业务逻辑拆分出来
 * 通过遍历list的方式，全部执行;
 * 业务场景:同步服务，既涉及到产品表 又涉及到商品表
 */
public class Main {
    public static void main(String[] args) {

        List<SyncService> syncServices = new ArrayList();
        syncServices.add(new GoodsInfoSyncService());
        syncServices.add(new ProductSyncService());

        CompositeSyncService compositeService = new CompositeSyncService();
        compositeService.setSyncServices(syncServices);

        compositeService.sync(new SyncRequest());


    }
}
