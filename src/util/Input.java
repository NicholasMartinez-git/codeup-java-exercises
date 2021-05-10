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
        int input = 0;
        boolean notAInteger = true;
        while (notAInteger) {
            try {
                input = Integer.parseInt(getString());
                notAInteger = false;// Stores user input
            } catch (Exception e) {
                System.out.println("You did not enter an integer. Try again");
            }
        }
        return input;
    }

    public static int getInt(String prompt) {
        int input = 0;
        boolean notAInteger = true;
        while (notAInteger) {
            try {
                System.out.printf("%s%n", prompt);
                input = Integer.parseInt(getString());
                notAInteger = false;// Stores user input
            } catch (Exception e) {
                System.out.println("You did not enter an integer. Try again");
            }
        }
        return input;
    }

    public static int getInt(int min, int max) {
        System.out.printf("Please enter a number from %s to %s: %n", min, max); // Prompts question
        int input = getInt(); // Stores user input

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
        double input = 0;
        boolean notANumber = true;
        while (notANumber) {
            try {
                input = Double.parseDouble(getString());
                notANumber = false;// Stores user input
            } catch (Exception e) {
                System.out.println("You did not enter an Number. Try again");
            }
        }
        return input;
    }

    public static double getDouble(String prompt) {
        double input = 0;
        boolean notANumber = true;
        while (notANumber) {
            try {
                System.out.printf("%s%n", prompt);
                input = Double.parseDouble(getString());
                notANumber = false;// Stores user input
            } catch (Exception e) {
                System.out.println("You did not enter an number. Try again");
            }
        }
        return input;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Please enter a number from %f to %f: %n", min, max); // Prompts question
        double input = Double.parseDouble(getString()); // Stores user input

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
