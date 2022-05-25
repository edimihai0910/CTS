package Command;

public abstract class iOperatiuneBancara {
    protected String cont;

    public iOperatiuneBancara(String cont){
        this.cont = cont;
    }
    public abstract void efectuarreOperatiuneBancare();
}
