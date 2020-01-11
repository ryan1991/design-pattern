package builder;

/**
 * 鸡腿堡
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 55.0f;
    }
}
