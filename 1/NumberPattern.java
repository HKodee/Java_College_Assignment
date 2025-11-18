import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of pyramid numbers to print: ");
        int rows = scanner.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(2*(rows - i))); // Print leading spaces

            // Inner loop for increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Inner loop for decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}