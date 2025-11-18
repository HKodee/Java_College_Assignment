import java.util.*;
// Base Class
class Box {
    public void print() {
        System.out.println("This is a generic box.");
    }
}

// Subclass
class ColoredBox extends Box {
    private String color;

    // Constructor to initialize the color
    public ColoredBox(String color) {
        this.color = color;
    }

    // Overriding the print() method of the Box class
    @Override
    public void print() {
        System.out.println("This is a Box with the color " + this.color + ".");
    }
}

// Main class to run the program
public class BoxDemo {
    public static void main(String[] args) {
        Box genericBox = new Box();
        ColoredBox blueBox = new ColoredBox("Blue");

        System.out.print("Calling print() on Box object: ");
        genericBox.print();

        System.out.print("Calling print() on ColoredBox object: ");
        blueBox.print(); // Calls the overridden method
    }
}