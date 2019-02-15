package skills.covariant;

/**
 * @Author ryan.song
 * @Date 2019/2/15
 **/
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Benz");
        Car clone = car.customClone();
        System.out.println(clone.getModel());

    }

}
