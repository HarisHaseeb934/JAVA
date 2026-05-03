package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pro4 {
    static void main(String[] args) {
        String str = "Java is easy Java is powerfull";
        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }


        // Pro5
        HashMap<Character, Integer> map2 = new HashMap<>();
        String name = "Johnny";
        char[] ca = name.toCharArray();
        for(char c : ca){
            if(map2.containsKey(c)){
                map2.put(c ,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> m : map2.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }
}
