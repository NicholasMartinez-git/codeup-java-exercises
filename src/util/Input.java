package util;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    public String getString(){
        System.out.println("please enter a string");
        return sc.next();
    }

    public static boolean yesNo(){
        System.out.println("please enter a string [yes/no]");
        String answer = sc.next();
        return (answer.startsWith("y"));
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a integer from %d to %d: %n", min, max); // Prompts question
        int input = Integer.parseInt(sc.nextLine()); // Stores user input

        // validates input is with min to max
        if (input < min || input > max) {
            // Re-prompts question if input is invalid
            System.out.println("Sorry, invalid error. Try again!");
            return getInt(min, max);
        }
        System.out.println("Valid Input!");
        return input;
    }

    public static int getInt() {
        return Integer.parseInt(sc.nextLine());
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number from %f to %f: %n", min, max); // Prompts question
        double input = sc.nextDouble(); // Stores user input

        // validates input is with min to max
        if (input < min || input > max) {
            // Re-prompts question if input is invalid
            System.out.println("Sorry, invalid error. Try again!");
            return getDouble(min, max);
        }
        System.out.println("Valid Input!");
        return input;
    }

    public static double getDouble() {
        return sc.nextDouble();
    }


}
