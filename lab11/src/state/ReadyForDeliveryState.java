package state;

public class ReadyForDeliveryState implements State {
    @Override
    public void updateState(FoodOrder f) {
        System.out.println("Ready for delivery...");
        f.foodOrderState = new InDeliveryState();
    }
}
