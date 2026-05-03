package collection.queue;

import java.util.PriorityQueue;

public class Pro4 {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(34);
        pq.add(67);
        pq.add(74);
        pq.add(68);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Haris");
        names.add("Soban");
        names.add("Mute");
        names.add("Usama");

        while(!names.isEmpty()){
            System.out.println(names.poll());
        }
    }
}
