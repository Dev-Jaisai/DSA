

public class Practice {

    public static void main(String[] args) {

        int[] number = {0, 2, 0, 1, 0, 3, 1, 0, 15};
        int size = number.length;

        int z = 0;
        int nz = 0;

        while (nz < size) {
            if (number[nz] == 0) {
                nz++;
            } else {
                int temp = number[nz];
                number[nz] = number[z];
                number[z] = temp;
                nz++;
                z++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }
}