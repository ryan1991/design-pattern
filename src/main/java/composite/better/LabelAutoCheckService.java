package composite.better;

import java.util.Arrays;
import java.util.List;

/**
 * 标签审核
 **/
public class LabelAutoCheckService implements AutoCheckService {
    public void contractCheck(AutoCheckRequest request, AutoCheckResponse response) {

        List<CheckItem> items = Arrays.asList(new CheckItem().setItem("贷款金额").setResult(0).setReason("金额范围为小于1000").setType(CheckTypeEnum.LABEL));
        response.putByType(CheckTypeEnum.LABEL, items);
    }
}
