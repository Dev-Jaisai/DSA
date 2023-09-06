package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachRepeat {
    public static void main(String[] args) {
     String name="jaisai";

     Map<String,Long> count=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(count);

    }
}
