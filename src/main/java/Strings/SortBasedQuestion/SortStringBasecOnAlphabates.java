package Strings.SortBasedQuestion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortStringBasecOnAlphabates {
    public static void main(String[] args) {
        String name="i love my country";
        String [] words=name.split(" ");

        for (int i = 0; i <words.length-1 ; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if (words[i].compareTo(words[j])>0){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }

        System.out.println(String.join(" ",words));
        //2nd way to use streams

        String sotedString = Arrays.stream(name.split(" " )).sorted().collect(Collectors.joining(" "));
        System.out.println(sotedString);
    }
}

