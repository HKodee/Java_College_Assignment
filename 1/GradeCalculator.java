import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Check if an argument was provided
        if (args.length == 0) {
            System.out.println("Please provide a percentage as a command-line argument.");
            return;
        }

        // Convert the string argument to an integer
        int percentage = Integer.parseInt(args[0]);
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("The grade for " + percentage + "% is: " + grade);
    }
}