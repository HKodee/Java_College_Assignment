import java.util.Scanner;

class Demo {
    static int count;

    static {
        count = 100;
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("Count: " + count);
    }
}

public class StaticMain {
    public static void main(String[] args) {
        Demo.show();
    }
}
