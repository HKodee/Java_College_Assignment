import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {

        String fileName = "data.txt";

        try (
            // For reading user input from keyboard
            Scanner scanner = new Scanner(System.in);

            // For writing to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        ) {
            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            while (true) {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(input);
                writer.newLine();  // go to next line in file
            }

            System.out.println("Data written to file successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // Now read from the same file
        System.out.println("\nReading from file:");
        try (
            BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading from file: " + e.getMessage());
        }
    }
}
