package exceptionHandeling.problem8;

public class InsufficientBalanceException  extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
