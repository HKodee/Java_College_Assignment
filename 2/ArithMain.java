import java.util.Scanner;

class Arithmetic {
    void add(int a, int b) {
        System.out.println("Add: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Divide: " + (a / b));
        else
            System.out.println("Division by zero error");
    }
}

public class ArithMain {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.add(20, 5);
        obj.subtract(20, 5);
        obj.multiply(20, 5);
        obj.divide(20, 5);
    }
}
