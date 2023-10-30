package Strings;

public class CountVowels {

    public static void main(String[] args) {
        //Question 2: Write Java program to count the number of vowels present in a string.

        String name = "union";
        char[] ch = name.toCharArray();
        int count = 0;

        for (char c : ch) {
            boolean vowels = isVowels(c);
            if (vowels) {
                System.out.println(c + " is vowel");
                count++;
            } else {
                System.out.println(c + " is not vowels");
            }
        }
        System.out.println("count of vowels is " + count);

    }

    public static boolean isVowels(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}

