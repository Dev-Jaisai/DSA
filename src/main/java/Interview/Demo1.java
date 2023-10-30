package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        String name = "jaisai sarkate new zero";
        List<String> sortedStringBasedOnLength = Arrays.stream(name.split(" ")).sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(sortedStringBasedOnLength);

        List<String> sortedStringBasedOnName = Arrays.stream(name.split(" ")).sorted().collect(Collectors.toList());
        System.out.println(sortedStringBasedOnName);

       String [] words= name.split(" ");

        for (int i = 0; i <words.length -1; i++) {
            for (int j = i+1; j <words.length; j++) {
                if (words[i].compareTo(words[j])>0){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;

                }

            }
        }
        System.out.println(String.join(" ",words));
    }
}
