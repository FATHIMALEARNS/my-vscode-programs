import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        String filePath = "sample.txt";  // Path to your file

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;  // Count the line

                // Count characters in the line
                characterCount += line.length();

                // Count words in the line
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            scanner.close();

            System.out.println("Number of characters: " + characterCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}