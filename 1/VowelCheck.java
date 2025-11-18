import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        // Prompt user input
        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0); // Read first character from input

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }

        scanner.close();
    }
}
