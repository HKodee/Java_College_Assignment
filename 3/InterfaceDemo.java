import java.util.*;
// Interface 1
interface I1 {
    void f1(); // abstract by default
}

// Interface 2
interface I2 {
    void f2(); // abstract by default
}

// Interface 3
interface I3 {
    void f3(); // abstract by default
}

// A single class implementing all three interfaces
class MyClass implements I1, I2, I3 {

    // Must provide implementation for f1() from I1
    @Override
    public void f1() {
        System.out.println("Executing f1() from Interface I1.");
    }

    // Must provide implementation for f2() from I2
    @Override
    public void f2() {
        System.out.println("Executing f2() from Interface I2.");
    }

    // Must provide implementation for f3() from I3
    @Override
    public void f3() {
        System.out.println("Executing f3() from Interface I3.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // The single object can call methods from all implemented interfaces
        System.out.println("Calling methods from a single object...");
        obj.f1();
        obj.f2();
        obj.f3();
    }
}