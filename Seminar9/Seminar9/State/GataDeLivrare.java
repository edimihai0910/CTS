package ro.ase.cts.gr1085.Seminar9.State;

public class GataDeLivrare implements State {
    private static GataDeLivrare g = null;
    private GataDeLivrare(){}
    public static synchronized GataDeLivrare getGataDeLivrare(){
        if(g==null){
            g = new GataDeLivrare();
        }
        return g;
    }
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda este gata de livrare!");
    }
}
