package collection.list.arrayList;

import java.util.ArrayList;

public class Pro2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Peach");
        fruits.add("Apple");
        fruits.add("Orange");

        fruits.add(2,"Lichi");

        for(String s: fruits){
            System.out.println(s);
        }

        System.out.println(fruits.get(3));

        fruits.set(2,"Pomegranate");

        System.out.println(fruits);


        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("mango"));

        System.out.println(fruits.indexOf("Mango"));


    }
}
