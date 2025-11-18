import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String original = scanner.nextLine();
        String reversed = "";

        // Reverse the original string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if original and reversed strings are equal
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        scanner.close();
    }
}