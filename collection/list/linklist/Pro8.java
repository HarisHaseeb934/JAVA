package collection.list.linklist;

import java.util.LinkedList;

public class Pro8 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        int sum = 0;
//        for(int i = 0; i < list.size(); i ++){
//            sum += list.get(i);
//        }

//        System.out.println("Sum : " + sum);

//        System.out.println("Average : " + (sum/list.size()));
        System.out.println(list);
        for(int i = 0; i < list.size() / 2 ; i++){
                int temp = list.get(i);
                list.set(i, list.get(list.size() -1 - i));
                list.set(list.size() -1 - i, temp);
        }
        System.out.println(list);



        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) % 2==0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
