import java.util.Arrays;

public class RemoveElementAtSpecificIndex {
    public static void main(String[] args) {
        int[] num = {1, 2, 6, 5, 8, 7, 4, 5};
        int[] newArray = new int[num.length - 1];
        int removeIndex = 4;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (i == removeIndex) {
                continue;
            }
            newArray[index] = num[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
