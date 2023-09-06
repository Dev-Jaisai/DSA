package Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class  MergeTwoStringArray5 {
    public static void main(String[] args) {
        String[] array1 = {"Hello", "World"};
        String[] array2 = {"Java", "Programming"};

        String[] mergedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(String[]::new);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

}
