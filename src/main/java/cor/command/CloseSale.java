package cor.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class CloseSale implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("提车回家...");
        return false;
    }
}
