package Abstraction;

abstract class Payment {
    abstract void pay(double amount);
    void receipt(){
        System.out.println("Thank You For Shopping");
    }
}
class CreditCard extends Payment{
    void pay(double amount){
        System.out.println("Your " + amount + " are paid through Credit Card");
    }
}
class PayPal extends Payment{
    void pay(double amount){
        System.out.println("Your " + amount + " are paid through PayPal");
    }
}