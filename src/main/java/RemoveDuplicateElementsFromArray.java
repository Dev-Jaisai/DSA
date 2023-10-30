import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        int[] num = {55,55,6,6,1,1,2,3,6,6,2,1,3,10};

        int[] temp = new int[num.length];
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (num[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index] = num[i];
                index++;
            }
        }


        System.out.println("Array with duplicate integers removed: " + Arrays.toString(Arrays.copyOf(temp, index)));
            Arrays.stream(num).distinct().sorted().forEach(System.out::println);
    }
}
