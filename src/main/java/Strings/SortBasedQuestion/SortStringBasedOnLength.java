package Strings.SortBasedQuestion;

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
    }
}
