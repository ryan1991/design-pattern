package visitor.dispatch.stat.visitor;

/**
 * 客户端
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class Client {

    public static void main(String[] args) {
        Service saving = new Saving();
        Service fund = new Fund();
        Service draw = new Draw();
        Visitor visitor = new Visitor();
        saving.accept(visitor);
        fund.accept(visitor);
        draw.accept(visitor);

    }


}
