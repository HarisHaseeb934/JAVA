package Interfaces.payment;

interface Payment {
    void pay(double amount);
    default void receipt(){
        System.out.println("Thank You For Purchasing");
    }
    static boolean validate(double amount){
        return amount > 0;
    }
}
