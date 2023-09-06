package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiplyIntArray {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3};

//Square And Sum ------------>Sum Formula for reduce (0,(x,y)->x+y)

        Integer sum = Arrays.stream(num).mapToInt(x->x*x).reduce(0,(x,y)->x+y);
        System.out.println(sum);

        //Sum of All Elements
        System.out.println( Arrays.stream(num).reduce(0,(x,y)->x+y));

        System.out.println(Arrays.stream(num).reduce(1,(x,y)->x*y));
    }
}
