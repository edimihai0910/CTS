package facade;

public class MasinaHibrid extends Masina{

    private boolean plugin;

    public MasinaHibrid() {
    }

    public MasinaHibrid(String producator, String sasiu, String culoare, boolean plugin) {
        super(producator, sasiu, culoare);
        this.plugin = plugin;
    }

    @Override
    public String getDetails() {
        return "Producator: "+this.getProducator()+", sasiu: "+this.getSasiu()+", culoare: "+this.getCuloare()+", plug-in: "+this.plugin;
    }

    @Override
    public String toString() {
        return "MasinaHibrid{" + super.toString() +
                "plugin=" + plugin +
                "} " ;
    }
}
