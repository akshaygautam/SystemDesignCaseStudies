package caseStudies.vendingMachine;

public interface State {
    default void selectProduct(int code){
        throw new RuntimeException("This action is not allowed at this state");
    }

    default void acceptPayment(){
        throw new RuntimeException("This action is not allowed at this state");
    }

    default void cancel(){
        throw new RuntimeException("This action is not allowed at this state");
    }

    default Product dispense(){
        throw new RuntimeException("This action is not allowed at this state");
    }

    default void timeOut(){
        throw new RuntimeException("This action is not allowed at this state");
    }
}
