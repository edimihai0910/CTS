package state;

public class OrderSentState implements State {
    @Override
    public void updateState(FoodOrder f) {
        System.out.println("Order sent...");
        //f.foodOrderState = new CookingState();
        f.foodOrderState = CookingState.getInstance();
    }
}
