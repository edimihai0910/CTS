package copac;

public class Copac implements Cloneable {
    float h;
    String culoareFrunze;
    String tipCoroana;
    PozitieXOY pozitieXOY;

    public Copac(float h, String culoareFrunze, String tipCoroana, int x, int y) {
        this.h = h;
        this.culoareFrunze = culoareFrunze;
        this.tipCoroana = tipCoroana;
        this.pozitieXOY = new PozitieXOY(x, y);
    }

    public Copac(){}

    @Override
    public Copac clone() throws CloneNotSupportedException {
        Copac clone = (Copac) super.clone();
        clone.h = h;
        clone.culoareFrunze = culoareFrunze;
        clone.tipCoroana = tipCoroana;
        clone.pozitieXOY = new PozitieXOY(pozitieXOY.x, pozitieXOY.y);
        return clone;
    }

    public void setPozitieXOY(int x, int y) {
        this.pozitieXOY = new PozitieXOY(x, y);
    }

    @Override
    public String toString() {
        return "Copac{" +
                "h=" + h +
                ", culoareFrunze='" + culoareFrunze + '\'' +
                ", tipCoroana='" + tipCoroana + '\'' +
                ", pozitieXOY=" + pozitieXOY.toString() +
                '}';
    }
}
