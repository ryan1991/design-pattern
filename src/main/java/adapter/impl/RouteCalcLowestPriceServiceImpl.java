package adapter.impl;

import adapter.CalcLowestPriceServiceAdapter;
import adapter.Category;
import adapter.LowestPriceRequest;
import adapter.LowestPriceResult;

/**
 * 门票起价
 */
public class RouteCalcLowestPriceServiceImpl implements CalcLowestPriceServiceAdapter {

    public String category() {
        return Category.ROUTE.name();
    }

    public LowestPriceResult calcLowestPrice(LowestPriceRequest request) {
        if (!Category.ROUTE.name().equals(request.getCategory())){
            throw new IllegalArgumentException("route category is not match");
        }
        LowestPriceResult result = new LowestPriceResult();
        result.setLowestPrice(300);

        return result;
    }
}
