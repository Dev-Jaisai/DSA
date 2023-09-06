package Java_8;

import java.util.ArrayList;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        //Write a Java 8 program to get the sum of all numbers present in a list?

        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(3);
        al.add(2);
        al.add(4);
        al.stream().mapToInt(i->i).sum();
        //*********OR**********
        al.stream().reduce((a,b)->a+b).ifPresent(System.out::println);

    }
}
