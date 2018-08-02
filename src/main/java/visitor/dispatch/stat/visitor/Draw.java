package visitor.dispatch.stat.visitor;

/**
 * 提款
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class Draw implements Service {
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}
