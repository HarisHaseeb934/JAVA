package collection.list.arrayList;

import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(215);
        list.add(234);
        list.add(264);
        list.add(67);
        list.add(33);
        list.add(36);
        list.add(58);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                even.add(list.get(i));
            }else{
                odd.add(list.get(i));
            }
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
