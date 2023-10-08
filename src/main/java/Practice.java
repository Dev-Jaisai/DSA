import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        //Number Reverse Kasa Karaycha?

        int[] number = {2, 5, 1, 4, 6};//--->{6,4,1,5,2}
        // Reversethis Number
        int n = number.length;
        for (int i = 0; i < n / 2; i++) { //ethe for loop lavaych  ***i <n/2***
            int temp = number[i];//He 3 line formula ahe
            number[i] = number[n - 1 - i];
            number[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(number));

        //Java 8 Ni krych ka he? SAAANGGG N MMMMGGGG

        int [] numbers = {2, 5, 1, 4, 6};

        List<Integer> reversedNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.reverse(reversedNumbers);

        System.out.println(reversedNumbers);
    }
}