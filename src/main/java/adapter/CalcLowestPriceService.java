package adapter;

/**
 * 计算起价
 */
public interface CalcLowestPriceService {

    LowestPriceResult calcLowestPrice(LowestPriceRequest request);

}
