package Interfaces.banking;

class SavingAccount implements Bank.Account{
    double balance;
    SavingAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
