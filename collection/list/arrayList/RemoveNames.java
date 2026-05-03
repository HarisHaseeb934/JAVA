package collection.list.arrayList;

import java.util.ArrayList;

public class RemoveNames {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Haris");
        name.add("Zain");
        name.add("Abdullah");
        name.add("Usama");
        name.add("Faraz");
        name.add("Faizan");
        name.add("Abdul");


        ArrayList<String> newName = new ArrayList<>();
//        name.removeIf(s -> (s.length() <= 4));

        for (int i = 0; i < name.size(); i++){
            if(name.get(i).length() <= 4){
                name.remove(i);
            }
        }
        System.out.println(name);
    }
}
