package Interview;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //want remove 7 from int [] arr
       int [] arr={1,2,0,6,5,7};

       int rem=0;
       int index=0;

       int [] newArr= new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=rem){
                newArr[index]=arr[i];
                index++;
            }

        }
        // Create a new array of the correct size and copy elements
        int[] finalArr = Arrays.copyOf(newArr, index);

        System.out.println(Arrays.toString(finalArr));
    }
}

