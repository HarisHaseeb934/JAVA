package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pro9 {
    static void main(String[] args) {
        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>(5, 0.80f,true){

            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3;
            }
        };
        lmap.put("Haris", 22);
        lmap.put("Soban", 19);
        lmap.put("Mute", 15);

        for(Map.Entry<String , Integer> m : lmap.entrySet()){
            System.out.println(m.getKey());
        }

        lmap.put("Faraz", 21);
        lmap.put("Faizan", 21);

        for(Map.Entry<String , Integer> m : lmap.entrySet()){
            System.out.println(m.getKey());
        }



    }
}
