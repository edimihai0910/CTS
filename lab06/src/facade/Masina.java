package facade;

public abstract class Masina {
    private String producator;
    private String sasiu;
    private String culoare;

    public abstract String getDetails();

    public Masina() {
    }

    public Masina(String producator, String sasiu, String culoare) {
        this.producator = producator;
        this.sasiu = sasiu;
        this.culoare = culoare;
    }

    public String getProducator() {
        return producator;
    }

    public String getSasiu() {
        return sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "producator='" + producator + '\'' +
                ", sasiu='" + sasiu + '\'' +
                ", culoare='" + culoare + '\''+", ";
    }
}
