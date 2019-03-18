package visitor.dispatch.stat.better2;

/**
 * @Author ryan.song
 * @Date 2019/3/18
 **/
public class Mouse implements ComputerPart {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
