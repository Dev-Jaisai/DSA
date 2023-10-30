package Interview;

import java.util.*;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] num = {100, 2, 6, 5, 58, 46, 8};
        // Find the largest, second largest, and third largest numbers
        int largest = Integer.MIN_VALUE;
        int seconLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            } else if (num[i] > seconLargest) {
                thirdLargest = seconLargest;
                seconLargest = num[i];
            } else if (num[i] > thirdLargest) {
                thirdLargest = num[i];
            }
        }

        System.out.println(thirdLargest);
    }
}
