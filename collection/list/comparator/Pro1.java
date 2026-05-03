package collection.list.comparator;

import java.util.ArrayList;
import java.util.Collections;



public class Pro1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);

        System.out.println(list);

        Collections.sort(list, (a,b)-> (b - a));

        System.out.println(list);
    }
}
