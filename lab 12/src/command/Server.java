package command;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static Server instance = null;

    private Server(){};

    public static synchronized Server getInstance(){
        if(instance==null)
        {instance = new Server();}
        return instance;
    }

    List<OperatiuneBancara> operatiuneBancaraList = new ArrayList<>();

    public void addOperatiune(OperatiuneBancara op){
        operatiuneBancaraList.add(op);
    }

    public void prelucrareOperatiuni() throws InterruptedException {
        for (OperatiuneBancara op: operatiuneBancaraList) {

            op.efectuareOperatiune(56);

        }
    }

}
