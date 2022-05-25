package state;

public class InDeliveryState implements State {
    @Override
    public void updateState(FoodOrder f) {
        System.out.println("Delivering...");
        f.foodOrderState = new DeliveredState();
    }
}
