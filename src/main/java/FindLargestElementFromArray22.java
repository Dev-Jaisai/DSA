public class FindLargestElementFromArray22 {

    public static void main(String[] args) {

        int[] num={1,23,1000,52,100};

        int largest=num[0];

        for (int i = 1; i <num.length ; i++) {
            if(num[i]>largest){
                largest=num[i];
            }

        }
        System.out.println(largest);
    }
}
