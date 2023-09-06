package Strings;

import java.util.Arrays;

public class CountWordsInString2 {
    public static void main(String[] args) {
        String name="Hello Word Hello Word";

        String[] words = name.split(" ");

        for(String word:words){
            System.out.println(word+" "+word.length());
        }

        int length = words.length;

       // System.out.println(length);


        //Using Java 8
        String newName="Jaisai Sarkate Hello Words";

        long count = Arrays.stream(newName.split(" ")).count();
        //System.out.println(count);

    }
}
