

public abstract class  CarAbstractDecorator implements Vehicle {

    protected Vehicle vehicle;

    public CarAbstractDecorator(Vehicle vehicle){
        this.vehicle = vehicle;
    }


    @Override
    public void startEngine() {
        vehicle.startEngine();
    }
}
