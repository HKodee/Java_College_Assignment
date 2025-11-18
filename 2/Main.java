import java.util.Scanner;

class Box {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width = 2;
        box1.height = 3;
        box1.depth = 4;

        Box box2 = new Box();
        box2.width = 5;
        box2.height = 6;
        box2.depth = 7;

        System.out.println("Volume 1: " + box1.volume());
        System.out.println("Volume 2: " + box2.volume());
    }
}
