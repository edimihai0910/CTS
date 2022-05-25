package lab03;

import java.util.List;

public class Agentie {

    private static Agentie single_instance = null;

    String locatie;
    int nr_angajati;
    String denumire;
    List<Serviciu> servicii;
    List<Client> clienti;

    private Agentie(){

    };

    private Agentie(String locatie, int nr_angajati, String denumire, List<Serviciu> servicii) throws Exception {

            if(locatie.length()>=10 && nr_angajati > 1 && denumire.length() > 5)
            {
                this.locatie=locatie;
                this.nr_angajati=nr_angajati;
                this.denumire=denumire;
                this.servicii=servicii;
            }
            else {
                throw new Exception();
            }

    }

    public static synchronized Agentie getInstance(String locatie, int nr_angajati, String denumire, List<Serviciu> servicii) throws Exception {
        if (single_instance == null)
            single_instance = new Agentie(locatie, nr_angajati, denumire, servicii);

        return single_instance;
    }

    public int getNr_angajati() {
        return nr_angajati;
    }
}
