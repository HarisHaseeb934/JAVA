package collection.set.hashset;

import java.util.HashSet;

public class Pro1 {
    static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(17);
        hs.add(6);
        hs.add(7);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        for(int s : hs){
            System.out.println(s);
        }

        hs.remove(4);

//        for(int s : hs){
//            System.out.println(s);
//        }

        System.out.println(hs.contains(5));
        System.out.println(hs.size());


    }
}
