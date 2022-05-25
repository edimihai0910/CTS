package command;
public abstract class OperatiuneBancara {

    protected Cont cont;

    public OperatiuneBancara(){
        cont = new Cont();
    }

    public abstract void efectuareOperatiune(int suma) throws InterruptedException;

}
