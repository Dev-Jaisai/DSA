package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicatesWords1 {

    public static void main(String[] args) {
        String name = "Hello jaisai jaisai jay world world Hello";

        String[] words = name.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }

            }
            if (count > 1 && !words[i].equals("")) {
                System.out.println(words[i] + ": " + (count));
            }


        }

//        String newName="jaisai sarkate sarkate jaisai";
//
//        List<String> duplicatesWords = Arrays.stream(newName.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(x->x.getKey()+" "+x.getValue()).collect(Collectors.toList());
//        System.out.println(duplicatesWords);

    }
}

