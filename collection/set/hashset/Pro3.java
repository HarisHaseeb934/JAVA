package collection.set.hashset;

import java.util.HashSet;

public class Pro3 {
    static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs.add(1);
        hs.add(34);
        hs.add(165);
        hs.add(74);
        hs.add(2);

        hs2.add(2);
        hs2.add(43);
        hs2.add(67);
        hs2.add(25);
        hs2.add(1);

        hs.addAll(hs2);

        hs.retainAll(hs2);

        for(int s : hs){
            System.out.println(s);
        }

        hs.add(null);
        hs.add(null);

        for(Integer s : hs){
            System.out.println(s);
        }
    }
}
