package memento;
public class Main {

    public static void main(String[] args) {

        File f = new File("Continut");
        FileSnapshot fs = f.createSnapshot("first commit");
        f.print();
        VersionControlSystem vcs = new VersionControlSystem();
        vcs.addSnapshot(fs);
        f.setContent("Continut2");
        fs = f.createSnapshot("second commit");
        vcs.addSnapshot(fs);
        vcs.listSnapshots();

        f.print();
        f.restoreFileContent(vcs.getSnapshotById(1234));
        f.print();

    }
}
