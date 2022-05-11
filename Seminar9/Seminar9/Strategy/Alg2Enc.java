package ro.ase.cts.gr1085.Seminar9.Strategy;

public class Alg2Enc implements IEncStrategy{
    @Override
    public String Encrypt(String text) {
        text="Algoritm 2 : " + text;
        return text;
    }
}
