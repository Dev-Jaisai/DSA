package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {


        ArrayList<Employee> al = new ArrayList<>();

        Employee e1 = new Employee("jaisai", 30, 10000);
        Employee e2 = new Employee("jay", 25, 10000);
        Employee e3 = new Employee("Geet", 40, 200000);
        Employee e4 = new Employee("geeta", 40, 15000);
        Employee e5 = new Employee("Gettu", 40, 50000);


        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        List<String> sl = Arrays.asList("jaisai", "new ", "jaisai", "jaisai");
//
//        //give me the name whose length is geater that 5;
//
//       //count of Each word dee
//        //jaisai-3
//        //new-1//asss?
//
//        sl.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
//                entrySet().forEach(x-> System.out.println(
//                        x.getKey()+" "+x.getValue()
//                ));
//
//        sl.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
//                forEach((key,value)-> System.out.println(
//                        key+" "+value
//                ));
//
//        //jr te mhntl non repeating word de mhnje te repeat nhi hot ahe tr???
//
//        sl.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
//                entrySet().stream().filter(x->x.getValue()==1).forEach(x-> System.out.println(
//                        x.getKey()+" "+x.getValue()
//                ));
//
//        al.stream().mapToInt(x->x.salary).average().getAsDouble();
//       Map<Integer,String> newHashmap= al.stream().collect(Collectors.toMap(Employee::getAge,Employee::getName));
//        System.out.println(newHashmap);

        //***********Find First Non-Repeating Character From String************
        String name="jaisai sarkate";

        Optional<Character> result = name.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            System.out.println("First non-repeating character: " + result.get());
        } else {
            System.out.println("No non-repeating characters found.");
        }
        int [] num1={1,2,3,4,5};

        int[] num2={4,5,6,7,8};

        List<Integer> collect = Arrays.stream(num1).filter(value -> Arrays.stream(num2).anyMatch(x -> x == value)).boxed().collect(Collectors.toList());
        System.out.println(collect);

        //find out highest salary from each age
        al.stream().collect(Collectors.groupingBy(Employee::getAge)).entrySet().forEach(x-> System.out.println(
                x.getKey()+" "+x.getValue().stream().max(Comparator.comparing(y->y.getSalary())).get()
        ));

        HashMap<String,Integer> hm= new HashMap<>();

        hm.put("jaisai",1);
        hm.put("new",2);
        hm.put("jay",3);

        hm.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).forEach(x-> System.out.println(
                x.getKey()+" "+x.getValue()
        ));

        HashSet<String> hs= new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");

        List<Integer> nal = Arrays.asList(1, 2, 3, 5, 6, 8);

        int max = Collections.max(nal);

        Set<Integer> set = new HashSet<>(nal);

        List<Integer> missingNumbers = IntStream.rangeClosed(1, max)
                .filter(num -> !set.contains(num))
                .boxed() // Convert int to Integer
                .collect(Collectors.toList()); // Collect missing numbers to a list


        System.out.println(missingNumbers);


    }


    }
