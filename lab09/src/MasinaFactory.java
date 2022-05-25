
import java.util.HashMap;

public class MasinaFactory {
    private static HashMap<TipMasinaDeAfisat, Masina> masiniDeAfisat = new HashMap<TipMasinaDeAfisat, Masina>();

    public static Masina getMasina(TipMasinaDeAfisat tipMasinaDeAfisat)
    {
        if(masiniDeAfisat.containsKey(tipMasinaDeAfisat))
            return masiniDeAfisat.get(tipMasinaDeAfisat);
        else {
            Masina m = null;
            switch (tipMasinaDeAfisat)
            {
                case CAMION_VERDE -> {
                    m = new Camion("roti mari", "cabina rabatabila",
                            "Scania", "VERDE", "Incarcat cu piatra");
                }
                case CAMION_GALBEN -> {
                    m = new Camion("roti mari", "cabina rabatabila",
                            "Scania", "GALBEN", "Incarcat cu piatra");
                }
                case AUTOTURISM_VERDE -> {
                    m = new Autoturism("roti mici", "geamuri fumuriii",
                            "Volkswagen", "VERDE", "Suport dublu");
                }
                case AUTOTURISM_GALBEN -> {
                    m = new Autoturism("roti mici", "geamuri fumurii",
                            "Volkswagen", "GALBEN", "Suport dublu");
                }
                default -> {break;}
            }
            if(m != null)
                masiniDeAfisat.put(tipMasinaDeAfisat, m);
            return m;
        }
    }
}
