package adapter.impl;

import adapter.CalcLowestPriceService;
import adapter.LowestPriceRequest;
import adapter.LowestPriceResult;

import java.util.HashMap;
import java.util.Map;

/**
 * 聪明的Service
 * map实现
 */
public class SmartCalcLowestPriceServiceImpl implements CalcLowestPriceService {

    private Map<String, CalcLowestPriceService> serviceMap = new HashMap<String, CalcLowestPriceService>();


    public LowestPriceResult calcLowestPrice(LowestPriceRequest request) {
        String category = request.getCategory();
        if (category == null || category.equals("")){
            throw new IllegalArgumentException("category is null ");
        }
        CalcLowestPriceService calcService = serviceMap.get(category);
        if (calcService == null){
            throw new NullPointerException("calcLowestPriceService need register first");
        }

        return calcService.calcLowestPrice(request);
    }

    public void registerService(String category, CalcLowestPriceService service){
        serviceMap.put(category, service);
    }
}
