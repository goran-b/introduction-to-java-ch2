package chapter06;

public class isPrime {
    /*(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
    isPrime(int number) method for testing whether a number is prime. Use this
    method to find the number of prime numbers less than 10000 .*/
    public static void main(String[] args) {
        checkPrimeNumbers();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void checkPrimeNumbers() {
        int counter = 0;
        for (int i = 0; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There is " + counter + " prime numbers");
    }
}
