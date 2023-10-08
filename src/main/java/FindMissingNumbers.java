import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] input = {1,1, 15, 3, 6, 41,100};
        int [] copy = new int[101];
        int[] missingNumber= new int[101];
        int count=0;
        int max=0;
        for (int itr:input) {
            copy[itr]=1;

        }
        for (int i = 1; i < copy.length; i++) {
           if (copy[i]==0){
              // System.out.print(i+" ");
               missingNumber[count++]=i;
           }

        }
        for (int i=0;i<copy.length;i++){
            if (missingNumber[i]>max){
                max=missingNumber[i];
            }
        }

        System.out.println(max);
//
//        List<Integer> nal = Arrays.asList(1, 2, 3, 5, 6, 8);
//        int noMAx = Collections.max(nal);
//        Set<Integer> set = new HashSet<>(nal);
//        List<Integer> missingNumbers = IntStream.rangeClosed(1, noMAx)
//                .filter(num -> !set.contains(num))
//                .boxed() // Convert int to Integer
//                .collect(Collectors.toList()); // Collect missing numbers to a list
//        System.out.println(missingNumbers);
//

    }
}

