package Interfaces.payment;

interface Jazz {
    default void receipt(){
        System.out.println("Thank You For Purchasing");
    }
}
