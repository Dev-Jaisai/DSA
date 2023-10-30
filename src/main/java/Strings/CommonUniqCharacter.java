package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CommonUniqCharacter {
    public static void main(String[] args) {
        String str1 = "aaaaaaaaaaaaaaaaaaaaaaabccccccccccaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaabc";
        String str2 = "aaaaaabbbbbbbbbbbb";
        int count = 0;
        HashSet<Character> hs = new LinkedHashSet<>();
        HashSet<Character> hs2 = new LinkedHashSet<>();
        for (char c : str1.toCharArray()) {
            hs.add(c);
        }
        for (char c2 : str2.toCharArray()) {
            hs2.add(c2);
        }
        for (char c : hs) {
            if (hs2.contains(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

