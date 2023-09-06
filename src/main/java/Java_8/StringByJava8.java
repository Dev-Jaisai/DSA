package Java_8;

import java.util.Arrays;

public class StringByJava8 {
    public static void main(String[] args) {
        String[] name={"jaisai","jaisai","sarkate","new"};

        long count = Arrays.stream(name).filter(x -> "jaisai".equals(x)).count();

        System.out.println(count);
    }
}
