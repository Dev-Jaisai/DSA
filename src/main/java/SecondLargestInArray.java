import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestInArray {

    public static void main(String[] args) {

        int [] num={30,15,7,10,20,30,30,56,60};

        int largest= 0;
        int secondLargest=0;
        int thirdLargest=0;
        for (int i=0;i<num.length;i++){
            if (num[i]>largest){

                largest = num[i];
               }
        }
        System.out.println(largest);

        Integer secondMax = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
    }
}
//public class ThirdLargestElement {
//    public static void main(String[] args) {
//        int[] arr = {5, 3, 9, 7, 1, 10};
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        int thirdLargest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                thirdLargest = secondLargest;
//                secondLargest = largest;
//                largest = arr[i];
//            } else if (arr[i] > secondLargest && arr[i] != largest) {
//                thirdLargest = secondLargest;
//                secondLargest = arr[i];
//            } else if (arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != largest) {
//                thirdLargest = arr[i];
//            }
//        }
//
//        if (thirdLargest == Integer.MIN_VALUE) {
//            System.out.println("There is no third largest element.");
//        } else {
//            System.out.println("The third largest element is: " + thirdLargest);
//        }
//    }
//}
