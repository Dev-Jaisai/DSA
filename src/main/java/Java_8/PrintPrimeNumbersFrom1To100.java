package Java_8;

import java.util.Random;
import java.util.stream.IntStream;

public class PrintPrimeNumbersFrom1To100 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(PrintPrimeNumbersFrom1To100::printPrimeOrNot);
    }
    public static void printPrimeOrNot(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
