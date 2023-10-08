package Java_8;

import java.util.Arrays;
import java.util.List;

public class CountEmtyStringUsingJava8 {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("jaisai","","new","");

        System.out.println( name.stream().filter(x->x.length()==0).count());
    }
}
