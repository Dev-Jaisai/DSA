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
                num[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
