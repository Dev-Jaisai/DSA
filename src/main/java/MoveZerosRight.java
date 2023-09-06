public class MoveZerosRight {
    public static void main(String[] args) {
        int[] num = {0, 2, 0, 1, 0, 3, 1, 0, 15};
        int size = num.length;
        int z = 0;
        int nz = 0;
        while (nz < size) {
            if (num[nz] == 0) {
                nz++;
            } else {
                int temp = num[nz];
                num[nz] = num[z];
                num[z] = temp;
                nz++;
                z++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }
}