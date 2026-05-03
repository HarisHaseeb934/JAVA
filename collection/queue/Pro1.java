package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Pro1 {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(12);
        q.add(51);
        q.add(43);

        q.offer(45);
        System.out.println(q);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
//        System.out.println(q.remove());  Throws exception
        System.out.println(q.poll());
        System.out.println(q.peek());
//        System.out.println(q.element());  Throws exception
    }
}
