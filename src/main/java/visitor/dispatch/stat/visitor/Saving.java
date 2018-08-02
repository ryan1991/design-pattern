package visitor.dispatch.stat.visitor;

/**
 * 存款
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class Saving implements Service {

    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}
