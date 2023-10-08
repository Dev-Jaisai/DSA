import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroLeft {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 0, 1, 6, 1, 4, 5};
        int nz = 0;
        int z = 0;
        int size = num.length;
        while (nz < size) {
            if (num[nz] == 1) {
                int temp = num[nz];
                num[nz] = num[z];
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }

        List<Integer> nal = Arrays.asList(1, 1, 0, 5, 0, 1,1,0);

        List<Integer> result = nal.stream()
                .sorted(Comparator.comparingInt(i -> i != 0 ? 0 : 1))
                .collect(Collectors.toList());

        System.out.println("List with zeros moved to the left: " + result);

    }
}
