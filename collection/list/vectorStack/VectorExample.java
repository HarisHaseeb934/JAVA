package collection.list.vectorStack;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(3);
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);

        System.out.println(vec.size());

        System.out.println(vec.capacity());

        System.out.println(vec);

        Thread t1 = new Thread(()->{
            vec.add(6);
        });
        Thread t2 = new Thread(()->{
            vec.add(7);
        });

        t1.start();
        t2.start();
        try{
            t1.join();
        t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(vec);
    }
}
