package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLock {
    private final Lock LOCK =  new ReentrantLock(true);
    void access(){
        LOCK.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " Acquire");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println(Thread.currentThread().getName()  + " Release");
            LOCK.unlock();
        }
    }

    public static void main(String[] args) {
        FairLock fl = new FairLock();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                fl.access();
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        try{
            t1.start();
            Thread.sleep(100);
            t2.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
