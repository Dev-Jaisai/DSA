import java.util.Random;
import java.util.function.Supplier;

public class Supplie1 {

    public static void main(String[] args) {

        Supplier<Integer> s=()->new Random().nextInt(100);

        System.out.println(s.get());
    }
}
