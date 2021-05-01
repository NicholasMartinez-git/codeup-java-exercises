package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("please enter a string");
        return this.sc.next();
    }

    public boolean yesNo(){
        System.out.println("please enter a string [yes/no]");
        String answer = this.sc.next();
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
}
