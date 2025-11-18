class AgeException extends Exception {
    AgeException(String s) {
        super(s);
    }
}

class TooYoungException extends AgeException {
    TooYoungException(String s) {
        super(s);
    }
}

class InvalidAgeException extends AgeException {
    InvalidAgeException(String s) {
        super(s);
    }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws AgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        } else if (age < 18) {
            throw new TooYoungException("You are too young to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}