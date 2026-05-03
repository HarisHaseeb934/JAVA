package collection.list;

// Maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements.
// It can have the duplicate elements also. We can also store the null elements in the list.

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

//        How to create List?
        List<String> list = new ArrayList<>();

//        Common Operations
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
        list.add("C#");

        list.remove(1);
        list.remove("Java");

        System.out.println(list.get(1));

//        convert Array to List
        String array[] = {"Java", "Javascript", "C++", "C#"};
        List<String> list1 = Arrays.asList(array);

//        convert List to Array
        List<String> fruitList = new ArrayList<>();
        fruitList.add("mango");
        fruitList.add("peach");
        fruitList.add("apple");
        fruitList.add("banana");

        String arrr[] = fruitList.toArray(new String[fruitList.size()]);

//        Sort a List
        Collections.sort(fruitList);
    }
}
