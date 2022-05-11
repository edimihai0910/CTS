package ro.ase.cts.gr1085.Seminar9.State;

public class ComandaMancare { //contextul
    private int nrComanda;
    private State state = ComandaPlasata.getComandaPlasata();

    ComandaMancare(int nrComanda) {
        this.nrComanda = nrComanda;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState(){
        state.updateState(this);
    }
}
