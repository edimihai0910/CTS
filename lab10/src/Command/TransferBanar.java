package Command;

public class TransferBanar extends iOperatiuneBancara{
    private float suma;
    private String contDestinatie;

    public TransferBanar(String cont, float suma, String contDestinatie) {
        super(cont);
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }
    @Override
    public void efectuarreOperatiuneBancare() {
        System.out.println("Contul "+ cont +" a transferat suma de "+suma+" RON catre contul "+contDestinatie);
    }
}
