package facade;


public class DealerAuto {

    private MasinaElectrica masinaElectrica = new MasinaElectrica("BMW","S12432J3","negru",12);
    private MasinaClasica masinaClasica = new MasinaClasica("Audi","34J93N","alb","aditiv1");
    private MasinaHibrid masinaHibrid = new MasinaHibrid("Renault","85934DF","negru",false);

    public String getDetailsMasinaElectrica(){
        return masinaElectrica.getDetails();
    }

    public String getDetailsMasinaClasica(){
        return masinaClasica.getDetails();
    }

    public String getDetailsMasinaHibrid(){
        return masinaHibrid.getDetails();
    }

}
