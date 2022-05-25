
public class Camion extends Masina{
    private String remorca;

    public Camion(String roti, String exterior, String sigla, String culoare, String remorca) {
        super(roti, exterior, sigla, culoare);
        this.remorca = remorca;
    }

    @Override
    void afiseaza() {
        System.out.println(this.toString().split("@")[1] +
                " - Camion{" + super.print() +
                "remorca='" + remorca + '\'' +
                '}');
    }
}
