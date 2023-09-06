import java.util.function.Consumer;

public class Consumer1 {

    public static void main(String[] args) {

        Consumer<String> abc= x-> System.out.println(x.toUpperCase());

        abc.accept("jaisai");


    }
}
