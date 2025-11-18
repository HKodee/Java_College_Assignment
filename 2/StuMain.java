import java.util.Scanner;

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }
}

public class StuMain {
    public static void main(String[] args) {
        Student s = new Student("Riya", 102);
        s.display();
    }
}
