package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo1 {

    static class Student{
        String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }



        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    public static void main(String[] args) {

    HashMap<Student,Integer> hm= new HashMap<>();
    hm.put(new Student("jaisai"),1000);
        hm.put(new Student("jaisai"),1000);
        hm.put(new Student("jaisai"),1000);

        for (Map.Entry h:hm.entrySet()) {
            System.out.println(h.getKey()+" "+h.getValue());
        }

    }


}
