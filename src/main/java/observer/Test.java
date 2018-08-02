package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 测试
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class Test {
    public static void main(String[] args) {
        House house = new House(10000);

        Observer A = new HousePriceObserver("A");
        Observer B = new HousePriceObserver("B");
        Observer C = new HousePriceObserver("C");

        house.addObserver(A);
        house.addObserver(B);
        house.addObserver(C);

        System.out.println(house);

        house.setPrice(6000);
        house.setPrice(8000);

    }

}
