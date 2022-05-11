package ro.ase.cts.gr1085.Seminar9.Strategy;

public class Alg1Enc implements IEncStrategy{
    @Override
    public String Encrypt(String text) {
        text="Algoritm 1 : " + text;
        return text;
    }
}
