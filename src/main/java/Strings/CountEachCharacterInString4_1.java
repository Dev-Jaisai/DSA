package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountEachCharacterInString4_1 {
    public static void main(String[] args) {

        String name="Hello Wordls Hi";

        HashMap<Character,Integer> m= new HashMap<>();
        for(char c:name.toCharArray()){
            if (!String.valueOf(c).contains(" ")){
                if (m.get(c)!=null){
                    m.put(c,m.get(c)+1);
                }else {
                    m.put(c,1);
                }
            }

        }
//        Iterator<Map.Entry<Character, Integer>> iterator = m.entrySet().iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry<Character,Integer> it=iterator.next();
//
//            System.out.println(it.getKey()+" "+it.getValue());
        }
    }