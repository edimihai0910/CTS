package Command;

import java.util.ArrayList;
import java.util.List;

public class ContBancar {
    private List<iOperatiuneBancara> listaOperatiuneBancara = new ArrayList<>();

    public void inserareOperatiuneBancara(iOperatiuneBancara operatie){
        listaOperatiuneBancara.add(operatie);
    }
    public void stergereOperatiuneBancara(iOperatiuneBancara operatie){
        listaOperatiuneBancara.remove(operatie);
    }
    public void trimitereOperatiuneBancara(){
        for(iOperatiuneBancara operatiune:listaOperatiuneBancara){
            operatiune.efectuarreOperatiuneBancare();
            stergereOperatiuneBancara(operatiune);
        }
    }
}
