package skills.intersectional;

import java.util.List;

/**
 *  组合模式
 *
 **/
public class WriterComposite<T extends Writer> implements Writer {
    private final List<T> writers;

    public WriterComposite(List<T> writers){
        this.writers = writers;
    }



    public void write() {
        for (Writer writer : writers){
            writer.write();
        }

    }
}
