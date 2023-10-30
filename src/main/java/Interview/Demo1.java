package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
      String name="jaisai";

        String collect = Arrays.stream(name.split("")).sorted().collect(Collectors.joining());
        System.out.println(collect);


    }
}

