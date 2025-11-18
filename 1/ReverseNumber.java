import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123, reversed = 0;
        System.out.println("Original Number: " + num);

        while(num != 0) {
            int digit = num % 10; // get last digit
            reversed = reversed * 10 + digit;
            num /= 10; // remove last digit
        }
        System.out.println("Reversed Number: " + reversed);
    }
}