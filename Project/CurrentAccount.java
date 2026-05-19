package Project;

public class CurrentAccount extends Account{

    private double extraMoney;

    CurrentAccount(String accountNumber, String name,double balance, String pin, double extraMoney){
        super(accountNumber, name, "Current",  balance, pin);
        this.extraMoney = extraMoney;
    }

    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        double avaliable = getBalance() + extraMoney;
        if(amount <= avaliable){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Limit Exceed");
        }
    }

    public String toString(){
        return super.getAccountNumber() + "," + super.getName() + "," + super.getAccountType() + "," + super.getBalance() + "," + extraMoney;
    }
    @Override
    String forSave(){
        return super.forSave() + "," + extraMoney;
    }
}
