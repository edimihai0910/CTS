package command;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Server s = Server.getInstance();
        
        s.addOperatiune(new AlimentareCont());
        s.addOperatiune(new Transfer());
        s.prelucrareOperatiuni();



    }
}
