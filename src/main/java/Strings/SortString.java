package Strings;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String[] words = {"USA", "South-Africa", "India", " Australia", "Denmark", "France", "Italy", "Germany"};

        int size = words.length;
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {
                if (words[i].compareTo(words[j]) > 0) {// jar he greater than 0 mhanje word[j] pahile yyala pahije mhi tr nhi
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
