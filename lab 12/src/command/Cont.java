package command;
public class Cont {

    public void Alimentare(int suma){
        System.out.println("Suma adaugata: "+suma);
    }

    public void Transfer(int suma) throws InterruptedException {
        System.out.println("transfer initializat..");
        Thread.sleep(2000);
        System.out.println("transfer complet!");
    }

}
