package Memento;

public class File {
    String contentFile;
    private String nameFile;

    public File(String content, String name) {
        this.contentFile = content;
        this.nameFile = name;
    }

    public String getContent() {
        return contentFile;
    }

    public void setContent(String content) {
        this.contentFile = content;
    }

    public FileSnapshot createSnapshot(String mes){
        return new FileSnapshot(this.contentFile,mes);
    }

    public void restoreFileContent(FileSnapshot fileSnapshot){
        if(fileSnapshot!=null)
            this.contentFile = fileSnapshot.getContent();
    }
    public void print(){
        System.out.println("File, name: " + nameFile + ", content: " + contentFile);
    }
}
