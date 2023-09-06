package Java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList();
        Random r= new Random();
        for (int i = 0; i < 10; i++) {
            al.add(r.nextInt(100));
        }
        al.stream().sorted().forEach(System.out::println);
        al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
