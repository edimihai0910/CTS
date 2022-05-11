package ro.ase.cts.gr1085.Seminar9.Strategy;

public class EncryptionEngine {
    private IEncStrategy strategy;

    public void setStrategy(IEncStrategy strategy) {
        this.strategy = strategy;
    }

    public void getEncryptedText(String s){
        if(strategy!=null){
            String text= strategy.Encrypt(s);
            System.out.println(text);
        }
    }
}
