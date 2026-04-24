package Interfaces.banking;

class Main {
    public static void main(String args[]){
        SavingAccount sa = new SavingAccount(10000);
        System.out.println(sa.getBalance());
    }
}
