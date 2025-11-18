import java.util.Scanner;

class Box {
    double width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(double side) {
        width = height = depth = side;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class SConsMain {
    public static void main(String[] args) {
        Box b1 = new Box();           // Default
        Box b2 = new Box(3);          // Cube
        Box b3 = new Box(2, 3, 4);    // Custom

        System.out.println("Default Box: " + b1.volume());
        System.out.println("Cube Box: " + b2.volume());
        System.out.println("Custom Box: " + b3.volume());
    }
}
