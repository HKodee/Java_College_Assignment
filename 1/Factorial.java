import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;

        // Factorial of 0 is 1
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; ++i) {
                factorial *= i; // factorial = factorial * i
            }
            System.out.printf("The factorial of %d is %d\n", num, factorial);
        }
        scanner.close();
    }
}