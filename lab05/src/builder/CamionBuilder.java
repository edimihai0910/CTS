package builder;

public class CamionBuilder implements Builder{
    private Automobil automobil = new Automobil();

    @Override
    public void buildSasiu() {
        automobil.setSasiu("mare");
    }

    @Override
    public void buildMotor() {
        automobil.setMotor("capacitate mare");
    }

    @Override
    public Automobil getAutomobil() {
        return automobil;
    }
}
