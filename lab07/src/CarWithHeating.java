

public class CarWithHeating extends CarAbstractDecorator {

    private int numberOfSeats;

    public CarWithHeating(Vehicle vehicle) {
        super(vehicle);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void startEngine() {
        vehicle.startEngine();
        System.out.println("Heating seats...");
    }

}
