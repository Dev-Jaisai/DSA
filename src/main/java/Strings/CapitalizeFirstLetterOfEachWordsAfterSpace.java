package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetterOfEachWordsAfterSpace {
    public static void main(String[] args) {
        String name = "jaisai sarkate jay";
        boolean isNextWhite = true;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isWhitespace(c)) {
                isNextWhite = true;
            } else if (isNextWhite) {
                c = Character.toUpperCase(c);
                isNextWhite = false;
            }
            System.out.print(c);

        }

       String capital= Arrays.stream(name.split(" ")).
                map(x->x.substring(0,1).toUpperCase()+x.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println();
        System.out.println(capital);
    }
}
