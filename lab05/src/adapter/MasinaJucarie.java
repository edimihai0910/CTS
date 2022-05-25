package adapter;

public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza() {
        System.out.println("0.01km/h");
    }

    @Override
    public void emiteSunete() {
        System.out.println("canta");
    }
}
