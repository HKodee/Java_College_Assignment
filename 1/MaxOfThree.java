import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int n1 = 10, n2 = 25, n3 = 15;

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the maximum number.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the maximum number.");
        } else {
            System.out.println(n3 + " is the maximum number.");
        }
    }
}