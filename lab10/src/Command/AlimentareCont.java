package Command;

public class AlimentareCont extends iOperatiuneBancara{

    private float suma;

    public AlimentareCont(String cont,float suma) {
        super(cont);
        this.suma = suma;
    }
    @Override
    public void efectuarreOperatiuneBancare() {
        System.out.println("Contul "+ cont + " a fost alimentat cu: "+ suma +" RON.");
    }
}
