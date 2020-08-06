package cor;

import cor.command.ArrangeFinancing;
import cor.command.CloseSale;
import cor.command.NegotiateSale;
import cor.command.TestCarCommand;
import org.apache.commons.chain.Chain;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * 买车流程： 试车 -> 销售谈判 -> 安排财务 -> 结束销售
 */
public class SellCarChain extends ChainBase {
    public SellCarChain(){
        super();
        addCommand(new TestCarCommand());
        addCommand(new NegotiateSale());
        addCommand(new ArrangeFinancing());
        addCommand(new CloseSale());
    }

    public static void main(String[] args) throws Exception {
        Chain chain = new SellCarChain();
        boolean result = chain.execute(new ContextBase());
        System.out.println(result);
    }
}
