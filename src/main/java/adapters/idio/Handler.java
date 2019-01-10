package adapters.idio;

public interface Handler {

    void registered();

    void unregistered();

    void active();

    void inactive();

    void read();

    void readComplete();

}
