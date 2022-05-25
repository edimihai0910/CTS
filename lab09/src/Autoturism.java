
public class Autoturism extends Masina{
    private String suportBicicleta;

    public Autoturism(String roti, String exterior, String sigla, String culoare, String suportBicicleta) {
        super(roti, exterior, sigla, culoare);
        this.suportBicicleta = suportBicicleta;
    }

    @Override
    void afiseaza() {
        System.out.println(this.toString().split("@")[1] +
                " - Autoturism{" + super.print() +
                "suportBicicleta='" + suportBicicleta + '\'' +
                '}');
    }
}
