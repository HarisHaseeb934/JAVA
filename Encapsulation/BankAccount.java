package Encapsulation;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount){
        balance += amount;
    }

    double withDraw(double amount){
        if(balance > 0 && balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Balance is Insufficient");
        }
        return amount;
    }
    void displayBalance(){
        System.out.println("Balance = " + balance);
    }
}
