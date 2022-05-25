package facade;

public class MasinaClasica extends Masina{

    private String aditivCompatibil;

    public MasinaClasica() {
    }

    public MasinaClasica(String producator, String sasiu, String culoare, String aditivCompatibil) {
        super(producator, sasiu, culoare);
        this.aditivCompatibil = aditivCompatibil;
    }

    @Override
    public String getDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "MasinaClasica{" + super.toString()+
                "aditivCompatibil='" + aditivCompatibil + '\'' +
                "} " ;
    }
}
