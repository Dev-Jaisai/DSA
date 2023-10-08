import java.util.stream.IntStream;

public class Print1To100Withoutforloop {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int num){
        if (num<=100){
            System.out.println(num);
            printNum(num+1);
        }
    }

}
