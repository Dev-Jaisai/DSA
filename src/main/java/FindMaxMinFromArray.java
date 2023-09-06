public class FindMaxMinFromArray {

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,100};
            int min=num[0];
        int max=num[0];
        for (int i = 1; i <num.length ; i++) {
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }

        }
        System.out.println(max+ " " + min);
    }
}
