package ro.ase.cts.gr1085.Seminar9.Strategy;

public class Main {
    public static void main(String[] args) throws Exception {
    EncryptionEngine e = new EncryptionEngine();
    e.setStrategy(new Alg1Enc());
    e.getEncryptedText("salut");
    e.setStrategy(new Alg2Enc());
    e.getEncryptedText("");
    }
}