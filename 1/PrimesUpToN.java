import java.util.Scanner;

public class PrimesUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit (n): ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
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