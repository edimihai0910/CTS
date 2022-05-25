package builder;

public class AutoturismBuilder implements Builder{

    private Automobil automobil;

    @Override
    public void buildSasiu() {
        automobil.setSasiu("mic");
    }

    @Override
    public void buildMotor() {
        automobil.setMotor("capacitate mica");
    }

    @Override
    public Automobil getAutomobil() {
        return automobil;
    }
}
