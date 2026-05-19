package Project;

public abstract class Account {

    private String accountNumber;
    private String name;
    private String type;
    private double balance;
    private String pin;

    Account(String accountNumber, String name, String type ,double balance, String pin){
        this.accountNumber = accountNumber;
        this.name = name;
        this.type  =type;
        this.balance = balance;
        this.pin = pin;
    }

    String getAccountNumber(){
        return accountNumber;
    }

    String getName(){
        return name;
    }

    String getAccountType() {
        return type;
    }

    double getBalance(){
        return balance;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        balance = balance + amount;
    }

    abstract void withdraw(double amount);

    boolean authentication(String pin){
        return this.pin.equals(pin);
    }

    String forSave(){
        return accountNumber + "," + name + "," + type + "," + balance + "," + pin;
    }

}
