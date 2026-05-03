package collection.set.treeset;

import java.util.TreeSet;

public class Pro1 {
    static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(34);
        ts.add(54);
        ts.add(76);
        ts.add(35);
        ts.add(87);
        ts.add(null);

//        for(int i : ts){
//            System.out.println(i);
//        }

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower(54));
        System.out.println(ts.higher(54));
    }
}
