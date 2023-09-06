package Java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<Employee> el = new ArrayList<>();

        el.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        el.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        el.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        el.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        el.add(new Employee(155, "Jiya Brein", 27, "Female", "HR", 2013, 22700.0));
        el.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        el.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        el.add(new Employee(188, "Jiya Brein", 31, "Male", "Product Development", 2015, 34500.0));
        el.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        el.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        el.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        el.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        el.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        el.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        el.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        el.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        el.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

            //Max Salary From Each Department Employee Name
//
//        el.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment))
//                .forEach((department, employees) ->
//                        employees.stream()
//                                .max(Comparator.comparingDouble(Employee::getSalary))
//                                .ifPresent(employee ->
//                                        System.out.println("Department: " + department +
//                                                ", Employee with Max Salary: " + employee.getName() +
//                                                ", Max Salary: " + employee.getSalary())));



//        el.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
//                .forEach((department, avgSalary) ->
//                System.out.println("Department: " + department +
//                        ", Average Salary: " + avgSalary));

//        Map<String, List<Employee>> collect = el.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//
//        collect.forEach((department, employees) -> {
//            System.out.println(department);
//            employees.stream()
//                    .filter(employee -> employee.getSalary() > 23000)
//                    .map(Employee::getName)
//                    .forEach(System.out::print);
//        });

        //Count Number of Employees from Each Department
//        el.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).forEach((x,y)->{
//            System.out.println(x);
//            System.out.println(y);
//        });

        //Print employees from each department

//        el.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach(
//                (department,employees)->{
//                    System.out.println(department);
//                    employees.stream().map(Employee::getName).forEach(System.out::println);
//                });

        //findout the employee whoes salry greater tan 20k and name starts with 'j'

         el.stream().filter(x -> x.getSalary() > 20000 && x.getName().startsWith("J")).forEach(employee -> {
             System.out.println("ID: "+ employee.















































                     getId()+", Name :"+employee.getName()+", Salary :"+employee.getSalary());
         });
    }
}


