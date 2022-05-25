package Command;

public class Main {
    public static void main(String[] args) {
        ServerOperatiuneBancara server = ServerOperatiuneBancara.getInstance();

        iOperatiuneBancara alimentareCont = new AlimentareCont("4211BCR1554998",155);
        iOperatiuneBancara transferBancar = new TransferBanar("4111BRD12112212",2000, "4211BCR1554998");

        server.inregistreazaOperatiune(alimentareCont);
        server.inregistreazaOperatiune(transferBancar);
        server.prelucrareOperatiuni();
        server.prelucrareOperatiuni();
    }
}
