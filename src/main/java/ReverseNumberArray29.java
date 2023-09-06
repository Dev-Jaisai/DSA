import java.util.Arrays;

public class ReverseNumberArray29
{
    public static void main(String[] args) {


        int []num={1,2,3,4,5};

        int n = num.length;
        for (int i = 0; i <n/2 ; i++) {
            int temp=num[i];
            num[i]=num[n-1-i];
            num[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
