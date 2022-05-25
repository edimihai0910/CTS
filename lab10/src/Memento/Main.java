package Memento;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Memento","CTSLab");
        file1.print();

        FileSnapshot fs1 = file1.createSnapshot("first commit");
        VersionControlSystem system = new VersionControlSystem();
        system.addSnapshot(fs1);
        system.listSnapshots();
        file1.setContent("new content");
        file1.print();

        system.addSnapshot(file1.createSnapshot("Second commit"));

        file1.restoreFileContent(system.getVersion(1));
        file1.print();

        file1.setContent("third content");
        file1.print();

        system.addSnapshot(file1.createSnapshot("Third commit"));
        file1.restoreFileContent(system.getVersion(2));
        file1.print();
        file1.restoreFileContent(system.getVersion(1));
        file1.print();

        system.listSnapshots();

    }
}
