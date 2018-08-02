package visitor.dispatch.stat.visitor;

/**
 * 基金
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class Fund implements Service{

    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}
