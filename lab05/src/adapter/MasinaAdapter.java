package adapter;

public class MasinaAdapter implements JucarieMobila{
    private Masina masina;

    public MasinaAdapter(Masina masina) {
        this.masina = masina;
    }

    @Override
    public void seDeplaseaza() {
        masina.ruleaza();
    }

    @Override
    public void emiteSunete() {
        masina.claxoneaza();
    }
}
