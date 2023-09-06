package Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondLargestUsingJava8 {
    public static void main(String[] args) {


        String name="Hi Hello New World World Hi";

        Map<String, Long> collect = Arrays.stream(name.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.
                counting()));


      collect.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

      collect.forEach((x,y)-> System.out.println(x+" "+y));


    }
}
