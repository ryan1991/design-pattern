package skills.covariant;

/**
 * @Author ryan.song
 * @Date 2019/2/15
 **/
public class Car implements CustomCloneable {
    private final String model;

    public Car(String model){
        this.model = model;
    }


    public Car customClone() {
        return new Car(this.model);
    }

    public String getModel(){
        return model;
    }
}
