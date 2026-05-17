package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private int balance;
    private final Lock LOCK = new ReentrantLock();

    void withDraw(int amount){
        try{
            if(LOCK.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        Thread.sleep(1000);
                        balance -= amount;
                    }catch(Exception e){
                        System.out.println(e);
                    }finally{
                        LOCK.unlock();
                    }
                }else{
                    System.out.println("Insufficient Balance");
                }
            }else{
                System.out.println("Resource is not Free");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
