import java.util.*;
// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

// Main class to demonstrate the concept
public class DispatchDemo {
    public static void main(String[] args) {
        // A reference of the superclass type
        Animal myAnimal;

        // Point the reference to a Dog object
        myAnimal = new Dog();
        // The JVM determines at RUNTIME that myAnimal is a Dog
        // so it calls the Dog's makeSound() method.
        myAnimal.makeSound();

        // Now, point the SAME reference to a Cat object
        myAnimal = new Cat();
        // The JVM determines at RUNTIME that myAnimal is now a Cat
        // so it calls the Cat's makeSound() method.
        myAnimal.makeSound();
    }
}