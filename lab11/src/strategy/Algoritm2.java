package strategy;
public class Algoritm2 implements EncryptionStrategy {
    @Override
    public String applyEncryption(String text) {
        return "#alg2#" + text.toLowerCase() + "#alg2#";
    }
}
