package adapter;

/**
 * 适配器
 */
public interface CalcLowestPriceServiceAdapter extends CalcLowestPriceService {

    /**
     * 品类标识
     * @return
     */
    String category();

}
