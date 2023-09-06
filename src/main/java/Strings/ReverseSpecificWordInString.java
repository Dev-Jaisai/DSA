package Strings;

public class ReverseSpecificWordInString {

    public static void main(String[] args) {

        String name = "Jaisai Sarkate Hello";
        String[] words = name.split(" ");
        String reverString = "";
        for (String word : words) {
            if (word.equals("Hello")) {
                String reverseWord = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reverseWord += word.charAt(i);
                }
                reverString += reverseWord + " ";
            } else {
                reverString += word + " ";
            }
        }
        System.out.println(reverString);
    }

}

