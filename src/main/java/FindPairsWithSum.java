public class FindPairsWithSum {
    public static void main(String[] args) {
        int[] arr = {0, 9, 2, 3, 4, 5, 6, 8, 9};
        int targetSum = 11;
        findPairs(arr, targetSum);
    }

    public static void findPairs(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("[" + arr[i] + ", " + arr[j] + "]");
                }
            }
        }
    }
}


//public class Demo1 {
//    public static void main(String[] args) {
//        int [] num={1,3,4,7,8,9,10};
//
//        int target=2;
//
//        for (int i = 0; i < num.length ; i++) {
//            for (int j = i+1; j < num.length; j++) {
//                if (num[j]-num[i]==target) {
//                    System.out.println("[" + num[j] + "-" + num[i]+"=" + target+"]");
//                }
//            }
//
//        }
//    }
//}
//
//[3-1=2]
//        [9-7=2]
//        [10-8=2]


