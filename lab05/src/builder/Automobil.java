package builder;
public class Automobil {
    private String sasiu;
    private String motor;

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "sasiu='" + sasiu + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
