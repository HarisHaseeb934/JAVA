package Project;

public class SavingAccount extends Account{

    private double interest;

    SavingAccount(String accountNumber, String name,double balance, String pin, double interest){
        super(accountNumber, name, "Saving",  balance, pin);
        this.interest = interest;
    }

    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public String toString(){
        return super.getAccountNumber() + "," + super.getName() + "," + super.getAccountType() + "," + super.getBalance() + "," + interest;
    }

    @Override
    String forSave(){
        return super.forSave() + "," + interest;
    }
}
