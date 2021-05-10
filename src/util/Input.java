package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);;

    // TODO: Rule-of-Thump for using static => "Does it make sense to call this method, even if no object has been constructed yet?"

    public static String getString() {
        String str = scanner.nextLine(); // Stores user input
        return str;
    }

    public static String getString(String prompt) {
        System.out.printf("%s%n", prompt);
        String str = scanner.nextLine(); // Stores user input
        return str;
    }

    public static boolean yesNo() {
        String answer = scanner.nextLine(); // Stores user input
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yea")){
            return true;
        } else {
            return false;
        }
    }

    public static boolean yesNo(String prompt) {
        System.out.printf("%s%n", prompt);
        String answer = scanner.nextLine(); // Stores user input
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yea")){
            return true;
        } else {
            return false;
        }
    }

    public static int getInt() {
        int input = scanner.nextInt(); // Stores user input
        return input;
    }

    public static int getInt(String prompt) {
        System.out.printf("%s%n", prompt);
        int input = scanner.nextInt(); // Stores user input
        return input;
    }

    public static int getInt(int min, int max) {
        System.out.printf("Please enter a number from %f to %f: %n", min, max); // Prompts question
        int input = scanner.nextInt(); // Stores user input

        // validates input is with min to max
        if (input < min || input > max) {
            // Re-prompts question if input is invalid
            System.out.println("Sorry, invalid error. Try again!");
            return getInt(min, max);
        }
        System.out.println("Valid Input!");
        return input;
    }

    public static double getDouble() {
        double input = scanner.nextDouble(); // Stores user input
        return input;
    }

    public static double getDouble(String prompt) {
        System.out.printf("%s%n", prompt);
        double input = scanner.nextDouble(); // Stores user input
        return input;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Please enter a number from %f to %f: %n", min, max); // Prompts question
        double input = scanner.nextDouble(); // Stores user input

        // validates input is with min to max
        if (input < min || input > max) {
            // Re-prompts question if input is invalid
            System.out.println("Sorry, invalid error. Try again!");
            return getDouble(min, max);
        }
        System.out.println("Valid Input!");
        return input;
    }
}
