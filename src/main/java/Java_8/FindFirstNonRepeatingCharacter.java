package Java_8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "1 some text 2 more text 4 more text 8";
        int sumNumber = 0;
//        int sum = name.chars()
//                .filter(Character::isDigit)
//                .mapToObj(x -> (char) x)
//                .mapToInt(Character::getNumericValue) // Corrected here
//                .sum();
//        System.out.println(sum);

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isDigit(c)) {
                int numericValue = Character.getNumericValue(c);
                sumNumber += numericValue;
            }
        }
        System.out.println(sumNumber);
    }
}
