import java.util.Scanner;

class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConsMain {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        System.out.println("Volume: " + box.volume());
    }
}
