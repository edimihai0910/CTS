package memento;

public class File {
    String content;
    String name;

    public File(String content)
    {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public FileSnapshot createSnapshot(String message)
    {
        return new FileSnapshot(this.content,message);
    }

    public void restoreFileContent(FileSnapshot fileSnapshot)
    {
        this.content = fileSnapshot.getContent();
    }


    public void print(){
        System.out.println(this.content);
    }


}
