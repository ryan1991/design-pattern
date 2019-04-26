package composite.better;

import java.util.Arrays;
import java.util.List;

/**
 *  合同审核业务：
 *  1.标签审核
 *  2.智能纠错
 *  3.风险审核
 *
 **/
public class Client {
    public static void main(String[] args) {
        AutoCheckService labelCheckService = new LabelAutoCheckService();
        AutoCheckService aiCheckService = new AIAutoCheckService();
        AutoCheckService riskCheckService = new RiskAutoCheckService();

        List<AutoCheckService> autoCheckServices = Arrays.asList(labelCheckService,aiCheckService, riskCheckService);
        AutoCheckService compositeCheckService = new CompositeAutoCheckService(autoCheckServices);
        AutoCheckRequest request = new AutoCheckRequest();
        request.setContract("贷款合同文档内容");
        AutoCheckResponse response = AutoCheckResponse.build();
        compositeCheckService.contractCheck(request, response);

        System.out.println(response);

    }
}
