package adapter;

/**
 * 起价计算结果
 */
public class LowestPriceResult {

    private long lowestPrice;

    public long getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(long lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    @Override
    public String toString() {
        return lowestPrice + "";
    }
}
