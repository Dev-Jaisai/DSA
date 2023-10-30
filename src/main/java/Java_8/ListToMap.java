package Java_8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Employee {
        private int id;
        private String name;
    }

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(1, "jaisai"));
        al.add(new Employee(2, "john"));
        al.add(new Employee(3, "alice"));

        // Convert List<Employee> to Map<Integer, String>
      Map<Integer,String> newMap=al.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));


       // System.out.println(newMap);
            List<Integer> l= Arrays.asList(1,2,3,6,4,5);

        Map<Integer, Integer> collect = l.stream().collect(Collectors.toMap(key->key*2, x -> x));
        System.out.println(collect);

    }
}
