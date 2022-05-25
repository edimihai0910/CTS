package memento;
public class FileSnapshot {

    String content;
    String message;
    public FileSnapshot(String content,String message)
    {
        this.content = content;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "FileSnapshot{" +
                "content='" + content + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
