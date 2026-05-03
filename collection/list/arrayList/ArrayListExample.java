package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

//        ArrayList in Java can also have duplicate elements.
//        It implements the List interface so that we can use all the methods of the List interface here.
//        The ArrayList maintains the insertion order internally.

//        Maintains Insertion Order
//        Non-Synchronized
//        Supports Random Access
//        Slower Manipulation compared to LinkedList
//        Requires Wrapper Classes for Primitive Types

//        Dynamic Resizing
//        Capacity (Initial 10 and increase to 1.5X)

        ArrayList<String> fruitlist = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>(15);

        String arr[] = {"Haris","Soban","Mute"};
        List<String> list3 = Arrays.asList(arr);
        ArrayList<String> names = new ArrayList<>(list3);

        fruitlist.add("Mango");
        fruitlist.add("Banana");
        fruitlist.add("Peach");
        fruitlist.add("Orange");

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.add(2, 80);

        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        numbers.addAll(1,list);

        System.out.println(numbers);
        System.out.println(numbers.get(5));

        Integer arra[] = numbers.toArray(new Integer[numbers.size()]);
        System.out.println(Arrays.toString(arra));

        System.out.println(numbers.contains(1));


        numbers.remove(1);
        numbers.remove(Integer.valueOf(1));

        numbers.removeAll(list) ;

        numbers.size();
        numbers.trimToSize();

        numbers.sort(null);
        System.out.println(numbers);




    }
}
