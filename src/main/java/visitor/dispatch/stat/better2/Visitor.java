package visitor.dispatch.stat.better2;

/**
 * @Author ryan.song
 * @Date 2019/3/15
 **/
public interface Visitor {


    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);

    void visit(ComputerPart computerPart);

}
