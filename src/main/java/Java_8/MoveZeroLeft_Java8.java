package Java_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeroLeft_Java8 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 2, 5, 0, 9, 12, 0, 13};


        Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x->x!=0)).
                values().stream().flatMap(x->x.stream()).forEach(System.out::print);

        int[] num=Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x->x!=0)).
                values().stream().flatMap(x->x.stream()).mapToInt(x->x).toArray();
        System.out.println(Arrays.toString(num));
    }
}
