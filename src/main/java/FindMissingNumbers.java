public class FindMissingNumbers {
    public static void main(String[] args) {


        int[] input = {1,1, 15, 3, 6, 4};

        int [] copy = new int[101];

        for (int itr:input) {

            copy[itr]=1;

        }
        for (int i = 1; i < copy.length; i++) {
           if (copy[i]==0){
               System.out.print(i+" ");
           }

        }
    }
}

