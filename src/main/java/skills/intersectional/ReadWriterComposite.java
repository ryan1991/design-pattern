package skills.intersectional;

import java.util.List;

/**
 **/
public class ReadWriterComposite<T extends ReadWriter> implements ReadWriter {
    private final List<T> readWriters;
    public ReadWriterComposite(List<T> readWriters){
        this.readWriters = readWriters;
    }


    public void read() {
        for (Reader reader : readWriters){
            reader.read();
        }


    }

    public void write() {
        for (Writer writer : readWriters){
            writer.write();
        }

    }
}
