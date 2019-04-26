package composite.better;

import java.util.Arrays;
import java.util.List;

/**
 * 智能纠错
 **/
public class AIAutoCheckService implements AutoCheckService {
    public void contractCheck(AutoCheckRequest request, AutoCheckResponse response) {
        List<CheckItem> items = Arrays.asList(new CheckItem().setItem("定金").setResult(0).setReason("定金是指当事人为了确保合同的履行").setType(CheckTypeEnum.AI));

        response.putByType(CheckTypeEnum.AI, items);
    }
}
