package strategy;
public class EncryptionEngine {

    String text;

    public EncryptionEngine(String text){
        this.text = text;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private EncryptionStrategy encryptionStrategy;

    public void setStrategy(EncryptionStrategy encryptionStrategy){
        this.encryptionStrategy = encryptionStrategy;
    }

    public String getEncryptedText(){
        return encryptionStrategy.applyEncryption(text);
    }

}
