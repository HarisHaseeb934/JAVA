package exceptionHandeling.problem8;

class Main {
    public static  void main(String args[]){
        Bank cus1 = new Bank("Haris", 15000);
        System.out.println(cus1.getName());
        try{
        System.out.println(cus1.withDraw(10000));
        System.out.println(cus1.withDraw(6000));
        }catch(InsufficientBalanceException e){
            System.out.println(e);
        }

    }
}
