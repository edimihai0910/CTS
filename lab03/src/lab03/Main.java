package lab03;

public class Main {

    public static void main(String[] args) throws Exception {

        Agentie agentie = Agentie.getInstance("Bucuresti Sector 4", 4, "Pararela 45", null);

        System.out.println(agentie.getNr_angajati());

    }
}