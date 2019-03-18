package visitor.dispatch.stat.better2;

/**
 * @Author ryan.song
 * @Date 2019/3/18
 **/
public class VisitorImpl implements Visitor {
    public void visit(Keyboard keyboard) {
        System.out.println("display  keyboard ...");
    }

    public void visit(Monitor monitor) {
        System.out.println("display  monitor ...");
    }

    public void visit(Mouse mouse) {
        System.out.println("display  mouse ...");
    }

    public void visit(Computer computer) {
        System.out.println("display  computer ...");
    }

    public void visit(ComputerPart computerPart) {
        System.out.println("default ..");
    }
}
