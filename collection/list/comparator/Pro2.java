package collection.list.comparator;

import java.util.ArrayList;

public class Pro2 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Haris");
        strList.add("Soban");
        strList.add("Mute");
        strList.add("Abdul-Wasay");
        strList.add("Abdul-Rahem");

        System.out.println(strList);
        strList.sort((s1,s2)->{
            if(s1.length() - s2.length() < 0){
                return -1;
            }else if(s1.length() - s2.length() > 0){
                return 1;
            }else{
                return s1.compareToIgnoreCase(s2);
            }
        });

        System.out.println(strList);

    }
}
