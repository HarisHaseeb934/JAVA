package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock LOCK = new ReentrantLock();
    void outer(){
//        LOCK.lockInterruptibly();
        LOCK.lock();
        try{
            System.out.println("Outer");
            inner();
        }catch(Exception e){

        }finally{
            LOCK.unlock();
        }
    }
    void inner(){
        LOCK.lock();
        try{
            System.out.println("Inner");
        }finally{
            LOCK.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample re = new ReentrantExample();
        re.outer();
    }
}
