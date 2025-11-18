import java.util.Scanner;

class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Indicates stack is empty
    }

    // Add an item to the top of the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            top++;
            stackArray[top] = item;
            System.out.println("Pushed " + item + " to the stack.");
        }
    }

    // Remove and return the top item from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1; // Return a sentinel value
        } else {
            int item = stackArray[top];
            top--;
            return item;
        }
    }

    // View the top item without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a sentinel value
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class StackDemo {
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(5);
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek (View Top)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    myStack.push(value);
                    break;
                case 2:
                    if (!myStack.isEmpty()) {
                        System.out.println("Popped " + myStack.pop() + " from the stack.");
                    } else {
                        myStack.pop(); // To print underflow message
                    }
                    break;
                case 3:
                     if (!myStack.isEmpty()) {
                        System.out.println("Top element is: " + myStack.peek());
                    } else {
                        myStack.peek(); // To print empty message
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}