package collection.set;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {
    static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        Thread t1 = new Thread(()->{
            for(int i = 0; i < 10; i++){
                set.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 50; i < 55; i++){
                set.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(set);
    }
}
