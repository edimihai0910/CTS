package state;

public class DeliveredState implements State {
    @Override
    public void updateState(FoodOrder f) {
        System.out.println("Order finished. Nothing else to be done.");
    }
}
