package Interview;

import java.util.HashSet;

public class NewHash {


    public static void main(String[] args) {
        HashSet<Employee> hs= new HashSet<>();
        Employee e1 = new Employee("jaisai", 20, 20);
        Employee e2 = new Employee("jaisai", 20, 20);
        hs.add(e1);
        hs.add(e2);

        System.out.println(hs);

    }
}
