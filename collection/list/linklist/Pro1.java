package collection.list.linklist;

import java.util.LinkedList;
import java.util.List;

public class Pro1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
