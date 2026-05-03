package collection.list.arrayList;

import Interfaces.Conflict.A;

import java.util.ArrayList;

public class Pro1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(568);
        list.add(38);
        list.add(632);

        System.out.println("For Loop");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Foreach Loop");
        for(int i: list){
            System.out.println(i);
        }

        list.remove(2);
        list.remove(Integer.valueOf(1));

        System.out.println(list);

        // Sum & Average
        int sum= 0;
        for(int i: list){
            sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/list.size());


        // MIN & MAX
        int min = list.getFirst();
        int max = list.getFirst();
        for (int i : list){
            if(i > max){
                max = i;
            }else if(min > i){
                min = i;
            }
        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
    }
}
