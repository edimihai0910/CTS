import adapter.MasinaAdapter;
import adapter.MasinaPersonala;
import builder.InginerAuto;

public class Main {
    public static void main(String[] args) {
//        BUILDER
        InginerAuto ia= null;
        try {
            ia = new InginerAuto("camion");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ia.buildAutomobil();
        //System.out.println(ia.getAutomobil());
        
//        ADAPTER
        MasinaPersonala masinaPersonala = new MasinaPersonala();
        masinaPersonala.ruleaza();
        MasinaAdapter masinaAdapter = new MasinaAdapter(masinaPersonala);
        masinaAdapter.seDeplaseaza();
        
    }
}
