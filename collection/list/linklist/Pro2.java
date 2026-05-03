package collection.list.linklist;

import java.util.LinkedList;

public class Pro2 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Haris");
        name.add("Usama");
        name.add("Faraz");
        name.add("Faizan");

        name.addFirst("Abdul-wasay");

        System.out.println(name);

        System.out.println(name.get(4));

        name.set(1,"Soban");

        System.out.println(name);


        name.remove(2);
        name.remove("Faizan");

        System.out.println(name);
    }
}
