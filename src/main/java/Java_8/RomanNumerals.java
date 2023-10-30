package Java_8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RomanNumerals {
    public static void main(String[] args) {
        // Create a mapping of integer values to Roman numerals
        Map<Integer, String> romanNumerals = new HashMap<>();
        romanNumerals.put(1, "I");
        romanNumerals.put(2, "II");
        romanNumerals.put(3, "III");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(6, "VI");
        romanNumerals.put(7, "VII");
        romanNumerals.put(8, "VIII");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");

        // Convert integers from 1 to 10 to Roman numerals using Java 8 streams
        List<String> romanList = IntStream.rangeClosed(1, 10)
                .mapToObj(romanNumerals::get)
                .collect(Collectors.toList());

        // Print the Roman numerals
        for (int i = 0; i < romanList.size(); i++) {
            System.out.println(i + 1 + " -> " + romanList.get(i));
        }
    }
}
