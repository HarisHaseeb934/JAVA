package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Pro6 {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Haris", 3);
        map.put("Soban", 4);
        map.put("Mute", 6);
        map.put("Faraz", 3);
        map.put("Faizan", 2);
        map.put("Zain", 4);

        int max = Integer.MIN_VALUE;
        String top = "";
        for(Map.Entry<String,Integer> m : map.entrySet()){
            if(m.getValue() > max){
                max = m.getValue();
                top = m.getKey();
            }
        }
        System.out.println("Toper is " + top + " and Marks " + max);
    }
}
