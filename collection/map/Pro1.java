package collection.map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pro1 {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(17,0.80f);
        map.put("Haris" , 22);
        map.put("Soban" , 19);
        map.put("Mute" , 15);
        map.put("Abdul-Wasay" , 22);


        System.out.println("Shows Key & Value");
        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Shows Only Key");
        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.values());

        // Pro 2

        System.out.println(map.get("Haris"));

        map.put("Haris",21);
        map.put("Huzefa", 21);

        // Pro 3

        System.out.println("Contains Key Haris : " + map.containsKey("Haris"));
        System.out.println("Contains Value 22 : " + map.containsValue(22));

        System.out.println("Size : " + map.size());

    }
}
