import java.util.Arrays;

public class AddElementAfterIndex {
    public static void main(String[] args) {
        int[] num = {1, 2,10,5, 3, 4, 5, 6, 7};
        int[] newArray = new int[num.length + 1];
        int target = 100;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            newArray[index] = num[i];
            index++;
            if (index == 5) {
                newArray[index] = target;
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
