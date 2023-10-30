package Strings.SortBasedQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortStringBasedOnLength {
    public static void main(String[] args) {
        String name="i love my country";

        //Using logic

        String[] words = name.split(" ");

        for (int i = 0; i <words.length-1 ; i++) {
            for (int j = i+1; j < words.length ; j++) {
              if (words[i].length()>words[j].length()){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }

        System.out.println(String.join(" ",words));

        //2nd way to sort strings based on length

        String sortedStringBasedOnLength = Arrays.stream(name.split(" ")).sorted(Comparator.comparingInt(String::length)).collect(Collectors.joining(" "));
        System.out.println(sortedStringBasedOnLength);
    }
}
