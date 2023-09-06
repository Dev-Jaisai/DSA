package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesWords1_1 {
    public static void main(String[] args) {

        String name="jaisai jaisai sarkate new new jais jais";

        String[] words = name.split(" ");
        Map<String,Integer> hm= new HashMap<>();

        for(String word:words){
      if (hm.containsKey(word)){
          hm.put(word,hm.get(word)+1);
      }else {
          hm.put(word,1);
      }
        }
            hm.entrySet().stream().forEach(x-> System.out.println(
                    x.getKey()+" -"+x.getValue()
            ));
    }
}
