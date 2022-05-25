package strategy;

public class Algoritm1 implements EncryptionStrategy {
    @Override
    public String applyEncryption(String text) {
        return "#alg1#" + text.toUpperCase() +"#alg1#";
    }
}
