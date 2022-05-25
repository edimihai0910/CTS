package facade;

public class MasinaElectrica extends Masina{
    private int autonomie;

    public MasinaElectrica() {
    }

    public MasinaElectrica(String producator, String sasiu, String culoare, int autonomie) {
        super(producator, sasiu, culoare);
        this.autonomie = autonomie;
    }

    @Override
    public String getDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "MasinaElectrica{"+ super.toString() +
                "autonomie=" + autonomie +
                "} " ;
    }
}
