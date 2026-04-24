package Interfaces.payment;

class UPI implements Payment{
    public void pay(double amount) {
        if (Payment.validate(amount)) {
            System.out.println(amount + " paid using UPI");
            receipt();
        } else {
            System.out.println("Amount is not sufficient");
        }
    }


}
