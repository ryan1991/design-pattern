package composite.better;

import java.util.Arrays;
import java.util.List;

/**
 * 风险审核
 **/
public class RiskAutoCheckService implements AutoCheckService {
    public void contractCheck(AutoCheckRequest request, AutoCheckResponse response) {
        List<CheckItem> items = Arrays.asList(new CheckItem()
                .setItem("币种符号不一致")
                .setResult(0)
                .setReason("《合同法》：双方经协商一致，最终确定合同总价为【币种】（大写：【小写金额】）")
                .setType(CheckTypeEnum.RISK));
        response.putByType(CheckTypeEnum.RISK, items);
    }
}
