import java.util.Scanner;

// Base Class
class Shape {
    public void get() {
        System.out.println("This is the get() method of the Shape class.");
    }

    public void print() {
        System.out.println("This is the print() method of the Shape class.");
    }
}

// Subclass
class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Overriding the get() method of the Shape class
    @Override
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        this.breadth = scanner.nextDouble();
    }

    // Overriding the print() method of the Shape class
    @Override
    public void print() {
        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

// Main class to run the program
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.get();  // Calls the overridden get() method in Rectangle
        rect.print(); // Calls the overridden print() method in Rectangle
    }
}