package memento;
import java.util.HashMap;

public class VersionControlSystem {

    static int idSnapshot = 1234;
    HashMap<Integer,FileSnapshot> map = new HashMap<>();




    public void addSnapshot(FileSnapshot fs){
        map.put(idSnapshot,fs);
        idSnapshot++;
    }

    public FileSnapshot getSnapshotById(int id)
    {
        return map.get(id);
    }

    public void listSnapshots()
    {
        System.out.println(map.toString());
    }

}
