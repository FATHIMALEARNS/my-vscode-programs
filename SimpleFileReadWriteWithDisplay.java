import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileReadWriteWithDisplay {
    public static void main(String[] args) {
        try {
            // Create FileReader and FileWriter objects
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");

            int data;
            // Read data one character at a time
            while ((data = reader.read()) != -1) {
                // Write the character to the output file
                writer.write(data);
                
                // Display the character in the console
                System.out.print((char) data);
            }

            // Close resources
            reader.close();
            writer.close();

            System.out.println("\nOperation successful!");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}