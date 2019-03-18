package visitor.dispatch.stat.better2;

/**
 * @Author ryan.song
 * @Date 2019/3/18
 **/
public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
    }


    public void accept(Visitor visitor) {
        for (ComputerPart part : parts){
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
