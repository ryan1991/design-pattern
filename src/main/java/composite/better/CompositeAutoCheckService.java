package composite.better;

import java.util.List;

/**
 * 组合
 **/
public class CompositeAutoCheckService implements AutoCheckService {

    private List<AutoCheckService> autoCheckServices;

    public CompositeAutoCheckService(List<AutoCheckService> autoCheckServices){
        this.autoCheckServices = autoCheckServices;
    }

    public void contractCheck(AutoCheckRequest request, AutoCheckResponse response) {

        for (AutoCheckService autoCheckService : autoCheckServices) {
            autoCheckService.contractCheck(request, response);
        }

    }
}
