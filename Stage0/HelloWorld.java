// Stage 0 - Day 1 Assignment
// Simple Hello World + Command-line arguments

public class HelloWorld {
    public static void main(String[] args) {
        // Print welcome message
        System.out.println("Hello Sachin, welcome to your Java Journey!");

        // Validate arguments
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        // Parse command-line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Display numbers
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Example calculation
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
