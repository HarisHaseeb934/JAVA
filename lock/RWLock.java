package lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {
    int count;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    void increment(){
        lock.writeLock().lock();
        try{
            count++;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            lock.writeLock().unlock();
        }
    }

    int getCount(){
        lock.readLock().lock();
        try {
            return count;
        }finally {
            lock.readLock().unlock();
        }
    }
    public static void main(String[] args) {
        RWLock rw = new RWLock();
        Runnable read = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + rw.getCount());
                }
            }
        };

        Runnable write = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    rw.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }
            }
        };

        Thread writerThread = new Thread(write);
        Thread readerThread1 = new Thread(read);
        Thread readerThread2 = new Thread(read);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        try {
            writerThread.join();
            readerThread1.join();
            readerThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final count: " + rw.getCount());
    }
}
