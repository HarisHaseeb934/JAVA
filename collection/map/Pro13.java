package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Pro13 {
    static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> occur = new HashMap<>();
        map1.put("Haris", 22);
        map1.put("Faraz", 22);
        map1.put("Soban", 19);
        map1.put("Mute", 15);

        for(Map.Entry<String,Integer> m : map1.entrySet()){
            if(occur.containsKey(m.getValue())){
                //m.getValue = occur key , occur.get(return occur value)
                occur.put(m.getValue(),occur.get(m.getValue())+1);
            }else{
                occur.put(m.getValue(),1);
            }
        }

        System.out.println(occur);
    }
}
