package cor.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class NegotiateSale implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("销售砍价...");
        return false;
    }
}
