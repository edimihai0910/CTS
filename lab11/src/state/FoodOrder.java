package state;

public class FoodOrder {

    int pret;
    State foodOrderState;

    public FoodOrder(int pret){

        this.pret = pret;
        foodOrderState = new OrderSentState();

    }

    void setState(State s){
        this.foodOrderState = s;
    }

    void nextState(){
        this.foodOrderState.updateState(this);
    }

}
