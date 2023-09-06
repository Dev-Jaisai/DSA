package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEachCharacterInString4 {
    public static void main(String[] args) {
     String name= "jaisaisarkate";

        char[] words = name.toCharArray();
        for (int i = 0; i < words.length; i++) {
            int count =1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i]==words[j]){
                    count++;
                    words[j]='0';
                }

            }
            if (count>=1&&words[i]!='0'){
                System.out.println(words[i]+" :"+count);
            }
        }
        List<String> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey() + "-->" + x.getValue()).collect(Collectors.toList());

     //   System.out.println(collect);
    }
}
