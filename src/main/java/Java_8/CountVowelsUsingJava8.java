package Java_8;

public class CountVowelsUsingJava8 {
    public static void main(String[] args) {
        String name="jaisai";

       long vowelsCount= name.chars().mapToObj(c->(char) c).filter(
                x->"AEIOUaeiou".contains(String.valueOf(x))).count();

        System.out.println(vowelsCount);
    }
}
