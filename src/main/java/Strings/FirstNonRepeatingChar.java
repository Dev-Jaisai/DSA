package Strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String name = "example";
        char[] words = name.toCharArray();
        char firstNonRepeatingChar = '0'; // Initialize to null character (default value for char)

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    count++;
                    words[j] = '0'; // Mark repeating characters with '0' to avoid recounting
                }
            }
            if (count == 1 && words[i] != '0') {
                firstNonRepeatingChar = words[i];
                break; // Found the first non-repeating character, no need to continue checking
            }
        }

        System.out.println(firstNonRepeatingChar);
    }
}