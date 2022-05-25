package state;

public class CookingState implements State {

    private CookingState(){}

    private static CookingState instance = null;

    public static synchronized CookingState getInstance(){
        if(instance == null ) instance = new CookingState();
        return instance;
    }

    @Override
    public void updateState(FoodOrder f) {
        System.out.println("Cooking...");
        f.foodOrderState = new ReadyForDeliveryState();
    }
}
