package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String name = "example";
        char[] words = name.toCharArray();
        char firstNonRepeatingChar = '0'; // Initialize to null character (default value for char)

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    count++;
                    words[j] = '0'; // Mark repeating characters with '0' to avoid recounting
                }
            }
            if (count == 1 && words[i] != '0') {
                firstNonRepeatingChar = words[i];
                break; // Found the first non-repeating character, no need to continue checking
            }
        }
        System.out.println(firstNonRepeatingChar);
//        HashMap<Character,Integer> hm= new LinkedHashMap<>();
//char firstNonRepeatingCharByHashmap='\0';
//        for(char c:name.toCharArray()){
//            hm.put(c,hm.getOrDefault(c,0)+1);
//        }
//        for (char c:name.toCharArray()){
//            if (hm.get(c)==1){
//                firstNonRepeatingCharByHashmap=c;
//                break;
//            }
//        }
//        System.out.println(firstNonRepeatingCharByHashmap);

        Map.Entry<String, Long> stringLongEntry = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get();
        System.out.println(stringLongEntry.getKey());

    }


}
