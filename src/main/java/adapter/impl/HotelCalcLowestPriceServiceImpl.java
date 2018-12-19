package adapter.impl;

import adapter.CalcLowestPriceServiceAdapter;
import adapter.Category;
import adapter.LowestPriceRequest;
import adapter.LowestPriceResult;

/**
 * 酒店起价
 */
public class HotelCalcLowestPriceServiceImpl implements CalcLowestPriceServiceAdapter {

    public String category() {
        return Category.HOTEL.name();
    }

    public LowestPriceResult calcLowestPrice(LowestPriceRequest request) {
        if (!Category.HOTEL.name().equals(request.getCategory())){
            throw new IllegalArgumentException("hotel category is not match");
        }
        LowestPriceResult result = new LowestPriceResult();
        result.setLowestPrice(200);

        return result;
    }
}
