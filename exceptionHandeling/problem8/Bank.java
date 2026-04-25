package exceptionHandeling.problem8;

class Bank {
    private String name;
    private double balance;

    Bank(String name , double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    double withDraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("InsufficientBalance");
        }else{
            balance = balance - amount;
        }
        return balance;
    }

}
