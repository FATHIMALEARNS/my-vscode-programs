import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of integers
        System.out.println("Enter a line of integers separated by spaces:");
        String inputLine = scanner.nextLine();

        // Use StringTokenizer to split the input into tokens
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        int sum = 0;

        System.out.println("The integers are:");
        // Loop through all tokens
        while (tokenizer.hasMoreTokens()) {
            // Parse each token as an integer
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println(number);
            sum += number; // Add the number to the sum
        }

        // Display the sum of the integers
        System.out.println("The sum of the integers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
