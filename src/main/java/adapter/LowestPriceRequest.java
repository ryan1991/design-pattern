package adapter;

/**
 * 起价请求
 */
public class LowestPriceRequest {
    //品类
    private String category;
    //天数内
    private int days;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
