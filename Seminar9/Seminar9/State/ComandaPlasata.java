package ro.ase.cts.gr1085.Seminar9.State;

public class ComandaPlasata implements State{
    private static ComandaPlasata c = null;
    private ComandaPlasata(){}
    public static synchronized ComandaPlasata getComandaPlasata(){
        if(c==null){
            c= new ComandaPlasata();
        }
        return c;
    }
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        //trimitere mesaj
        System.out.println("Comanda a fost plasata!");
        //schimbam contextul -> starea urmatoare
        comandaMancare.setState(InCursDePreparare.getInCursDePreparare());
    }
}
