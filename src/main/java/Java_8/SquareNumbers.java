package Java_8;

import java.util.ArrayList;

public class SquareNumbers {
    public static void main(String[] args) {

        //Square the list of numbers and then filter out the numbers greater than 10 and then find the average of filtered numbers
        ArrayList<Integer> al = new ArrayList<>();

        al.add(15);
        al.add(4);
        al.add(4);
        al.add(4);

        al.stream().mapToInt(i->i*i).filter(i->i>10).average().ifPresent(System.out::println);


        //Find the smallest and biggest number of a list using Java8

        al.stream().mapToInt(i->i).max().ifPresent(System.out::println);
        al.stream().mapToInt(i->i).min().ifPresent(System.out::println);

    }
}
