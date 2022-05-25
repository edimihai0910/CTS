package composite_v2;

public interface Receiver {
    void receive(String message);
    void addReceiver(Receiver receiver);
    void removeReceiver(Receiver receiver);
    Receiver getReceiver(int position);
}
