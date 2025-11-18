import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of prime numbers to print: ");
        int n = scanner.nextInt();

        int count = 0; // Counts how many primes we've found
        int num = 2;   // The number we are checking for primality

        while(count < n) {
            if(isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        scanner.close();
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}