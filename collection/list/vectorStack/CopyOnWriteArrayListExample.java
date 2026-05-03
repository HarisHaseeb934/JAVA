package collection.list.vectorStack;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Haris");
        list.add("Soban");
        list.add("Mute");
        list.add("Faraz");
        list.add("Faizan");
        for( String s : list){
            System.out.println(s);
            if(s == "Mute"){
                list.add("Usama");
            }
        }
        System.out.println(list);
    }
}
