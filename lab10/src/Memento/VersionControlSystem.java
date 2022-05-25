package Memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VersionControlSystem {
    private static int idSnapshot = 1;
    List<FileSnapshot> lista = new ArrayList<>();
    private Map<Integer,FileSnapshot> versionsMap = new HashMap<>();

    public void addSnapshot(FileSnapshot f){
        versionsMap.put(idSnapshot++,f);
    }

    public void getSnapshotById(int id){
        if(versionsMap.containsKey(id)){
            FileSnapshot f=versionsMap.get(id);
            System.out.println(f.message);
        }else{
            System.out.println("Cheia nu exista");
        }
    }
    public FileSnapshot getVersion(int id){
        if(versionsMap.containsKey(id)){
            return versionsMap.get(id);
        } else return null;
    }

    public void listSnapshots(){
        for (Integer key: versionsMap.keySet()){
            System.out.println(key+ " = " + versionsMap.get(key));
        }
    }
}
