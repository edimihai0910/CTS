package Command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuneBancara {
    private static ServerOperatiuneBancara server = null;
    private List<iOperatiuneBancara> listaOperatiuni;

    private ServerOperatiuneBancara(){
       this.listaOperatiuni = new ArrayList<>();
    }

    public static synchronized ServerOperatiuneBancara getInstance(){
        if(server==null){
            server = new ServerOperatiuneBancara();
        }
        return server;
    }

    public void inregistreazaOperatiune(iOperatiuneBancara operatiuneBancara){
        this.listaOperatiuni.add(operatiuneBancara);
    }

    public void prelucrareOperatiuni(){
        if (listaOperatiuni.size()>0){
            for(iOperatiuneBancara o : listaOperatiuni){
                o.efectuarreOperatiuneBancare();
            }
            listaOperatiuni.clear();
        }
        else{
            System.out.println("Nu exista operatiuni");
        }
    }
}
