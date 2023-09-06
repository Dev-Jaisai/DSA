package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateFromString6 {
    public static void main(String[] args) {
        String str = "Hello world world Hello";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (!result.contains(word)) {
                result += word + " ";
            }
        }

        result = result.trim();

        System.out.println("String with duplicate words removed: " + result);


        List<String> collect = Arrays.stream(str.split(" ")).distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
