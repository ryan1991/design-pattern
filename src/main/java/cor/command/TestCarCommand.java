package cor.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class TestCarCommand implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("试车...");
        return false;
    }
}
