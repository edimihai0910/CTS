package ro.ase.cts.gr1085.Seminar9.State;

public class InCursDePreparare implements State {
    private static InCursDePreparare i = null;

    private InCursDePreparare(){}

    public static synchronized InCursDePreparare getInCursDePreparare(){
        if( i ==null){
            i = new InCursDePreparare();
        }
        return i;
    }
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda este in curs de preparare");
        comandaMancare.setState(GataDeLivrare.getGataDeLivrare());
    }
}
