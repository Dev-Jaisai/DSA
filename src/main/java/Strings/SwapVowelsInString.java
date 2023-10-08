package Strings;

public class SwapVowelsInString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] c = s.toCharArray();
        while (start < end) {
            if (!isVowels(c[start])) {
                start++;
            } else if (!isVowels(c[end])) {
                end--;
            } else {
                char tem = c[start];
                c[start] = c[end];
                c[end] = tem;
                start++;
                end--;
            }
        }
        return String.valueOf(c);
    }

    public static boolean isVowels(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;

    }
}
