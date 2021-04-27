import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // We are asking the user for 2 numbers to utilize for our basic arithmetic methods
        System.out.print("Please enter 2 numbers you would like to run through the basic arithmetic methods?\n");
        double userInput1 = sc.nextDouble();
        double userInput2 = sc.nextDouble();
        // Ex: 1
        addition(userInput1, userInput2); // Calls "addition" method prioritizing the userInput as the parameter.
        subtraction(userInput1, userInput2); // Calls "subtraction" method prioritizing the userInput as the parameter.
        multiplication(userInput1, userInput2); // Calls "multiplication" method prioritizing the userInput as the parameter.
        division(userInput1, userInput2); // Calls "division" method prioritizing the userInput as the parameter.
    }

    public static void addition(double input1, double input2) {
        double sum = input1 + input2;
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Addition: " + x + " + " + y + " = " + "%.0f%n", sum);
        } else {
            System.out.printf("Addition: " + input1 + " + " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void subtraction(double input1, double input2) {
        double sum = input1 - input2;
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Subtraction: " + x + " - " + y + " = " + "%.0f%n", sum);
        } else {
            System.out.printf("Subtraction: " + input1 + " - " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void multiplication(double input1, double input2) {
        double sum = input1 * input2;
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Multiplication: " + x + " x " + y + " = " + "%.0f%n", sum);
        } else {
            System.out.printf("Multiplication: " + input1 + " x " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void division(double input1, double input2) {
        double sum = input1 / input2;
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Division: " + x + " / " + y + " = " + "%.0f%n", sum);
        } else {
            System.out.printf("Division: " + input1 + " / " + input2 + " = " + "%.2f%n", sum);
        }
    }
}
