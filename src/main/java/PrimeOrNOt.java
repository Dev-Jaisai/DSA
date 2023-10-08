public class PrimeOrNOt {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 4, 5, 9, 8, 10};

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If there's a divisor other than 1 and itself, it's not prime
            }
        }

        return true; // If none of the above conditions are met, it's prime
    }
}
