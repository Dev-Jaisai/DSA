package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Employee1> al = Arrays.asList(new Employee1("jaisai", 18, 2000, new State(1, "MH"))
                , new Employee1("jay", 20, 1500, new State(1, "CG"))
                , new Employee1("js", 25, 2000, new State(1, "GJ")));

        Comparator<Employee1> c=(o1,o2)->o1.age- o2.age;
        System.out.println(al);
    }
}
