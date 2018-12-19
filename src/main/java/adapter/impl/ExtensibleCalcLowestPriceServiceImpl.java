package adapter.impl;

import adapter.CalcLowestPriceService;
import adapter.CalcLowestPriceServiceAdapter;
import adapter.LowestPriceRequest;
import adapter.LowestPriceResult;

import java.util.ArrayList;
import java.util.List;

/**
 * 可扩展Service
 * list实现
 */
public class ExtensibleCalcLowestPriceServiceImpl implements CalcLowestPriceService {

    private List<CalcLowestPriceServiceAdapter> serviceAdapters = new ArrayList<CalcLowestPriceServiceAdapter>();

    public LowestPriceResult calcLowestPrice(LowestPriceRequest request) {
        String category = request.getCategory();
        if (category == null || category.equals("")){
            throw new IllegalArgumentException("category is null ");
        }
        if (serviceAdapters.size() == 0 ){
            throw new NullPointerException("serviceAdapters is empty");
        }
        for (CalcLowestPriceServiceAdapter adapter : serviceAdapters){
            if (category.equals(adapter.category())){
               return adapter.calcLowestPrice(request);
            }
        }

        return null;
    }

    public void addServiceAdapter(CalcLowestPriceServiceAdapter adapter){
        serviceAdapters.add(adapter);
    }
}
