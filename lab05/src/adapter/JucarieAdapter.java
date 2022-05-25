package adapter;
public class JucarieAdapter implements Masina{
    private JucarieMobila jucarie;

    public JucarieAdapter(JucarieMobila jucarie) {
        this.jucarie = jucarie;
    }

    @Override
    public void ruleaza() {
        jucarie.seDeplaseaza();
    }

    @Override
    public void claxoneaza() {
        jucarie.emiteSunete();
    }
}
