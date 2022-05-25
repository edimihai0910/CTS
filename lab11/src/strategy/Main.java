package strategy;
public class Main {
    public static void main(String[] args) {
        EncryptionEngine encryptionEngine = new EncryptionEngine("Hello. I'm here.");
        encryptionEngine.setStrategy(new Algoritm1());
        System.out.println(encryptionEngine.getEncryptedText());
        encryptionEngine.setStrategy(new Algoritm2());
        System.out.println(encryptionEngine.getEncryptedText());
    }



}
