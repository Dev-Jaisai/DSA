package Strings;

import java.util.Arrays;

public class CountOccurenceOfSubString3 {

    public static void main(String[] args) {
//        String name="Jasai Sarkate Jaisai";
//
//        String[] words = name.split(" ");
//        int count=0;
//        String subString="Sarkate";
//
//        for (String word:words) {
//
//            if (subString.equals(word)){
//                count++;
//            }
//
//        }
//        System.out.println(count);

        //Using java 8
//        String newName="Jaisai sarkate hello hello hello";
//
//        String newSubString ="hello";
//
//
//        long count1 = Arrays.stream(newName.split(" ")).filter(x -> x.contains(newSubString)).count();
//
//        System.out.println(newSubString+" "+count1);


        String newName = "Geetanjali";
        String newSubString = "ee";

        long count1 = newName.split(newSubString, -1).length - 1;

        System.out.println(newSubString + " " + count1);

    }
}
