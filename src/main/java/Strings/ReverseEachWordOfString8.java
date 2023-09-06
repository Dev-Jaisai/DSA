package Strings;

public class ReverseEachWordOfString8 {
    public static void main(String[] args) {
        String name = "Hello jaisai Sarkate ";


        String[] words = name.split(" ");
        String reverseString="";
        for (String word:words) {
            String reverseWord="";

            for(int i=word.length()-1;i>=0;i--){
                reverseWord+=word.charAt(i);
            }
            reverseString=reverseString+reverseWord+" ";//5+=5--->5=5+5
        }
        System.out.println(reverseString);
    }
}
