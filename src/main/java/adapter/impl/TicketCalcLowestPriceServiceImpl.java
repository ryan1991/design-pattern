package adapter.impl;

import adapter.CalcLowestPriceServiceAdapter;
import adapter.Category;
import adapter.LowestPriceRequest;
import adapter.LowestPriceResult;

/**
 * 门票起价
 */
public class TicketCalcLowestPriceServiceImpl implements CalcLowestPriceServiceAdapter {

    public String category() {
        return Category.TICKET.name();
    }

    public LowestPriceResult calcLowestPrice(LowestPriceRequest request) {
        if (!Category.TICKET.name().equals(request.getCategory())){
            throw new IllegalArgumentException("ticket category is not match");
        }
        LowestPriceResult result = new LowestPriceResult();
        result.setLowestPrice(100);

        return result;
    }
}
