package ro.ase.cts.gr1085.Seminar9.Strategy;

public class Alg3Enc implements IEncStrategy{
    @Override
    public String Encrypt(String text) {
        text="Algoritm 3 : " + text;
        return text;
    }
}
