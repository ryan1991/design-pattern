package visitor.dispatch.stat.better2;

/**
 * @Author ryan.song
 * @Date 2019/3/15
 **/
public class Keyboard implements  ComputerPart{

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
