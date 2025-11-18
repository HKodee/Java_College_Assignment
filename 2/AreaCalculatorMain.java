import java.util.Scanner;

class AreaCalculator {
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class AreaCalculatorMain {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(4);             // Square
        obj.area(5, 3);          // Rectangle
        obj.area(6.0, 2.0);      // Triangle
    }
}
