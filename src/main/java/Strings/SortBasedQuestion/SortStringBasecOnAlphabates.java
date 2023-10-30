package Strings.SortBasedQuestion;

public class SortStringBasecOnAlphabates {i
    public static void main(String[] args) {
        String name="i love my countr";
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
    }
}

