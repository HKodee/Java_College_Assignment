import java.util.Scanner;

class Data {
    int x;

    void modify(Data d) {
        d.x = d.x + 10;
    }
}

public class CallMain {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 5;

        System.out.println("Before: " + d.x);
        d.modify(d);
        System.out.println("After: " + d.x);
    }
}
