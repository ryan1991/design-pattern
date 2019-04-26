package composite.better;


public class CheckItem {
    private String item;
    private int result;
    private String reason;
    private CheckTypeEnum type;

    public String getItem() {
        return item;
    }

    public CheckItem setItem(String item) {
        this.item = item;
        return this;
    }

    public int getResult() {
        return result;
    }

    public CheckItem setResult(int result) {
        this.result = result;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CheckItem setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public CheckTypeEnum getType() {
        return type;
    }

    public CheckItem setType(CheckTypeEnum type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "CheckItem{" +
                "item='" + item + '\'' +
                ", result=" + result +
                ", reason='" + reason + '\'' +
                ", type=" + type +
                '}';
    }
}
