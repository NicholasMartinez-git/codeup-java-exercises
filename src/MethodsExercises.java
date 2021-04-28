import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // Ex: 1
        // We are asking the user for 2 numbers to utilize for our basic arithmetic methods
        /*
        System.out.print("Please enter 2 numbers you would like to run through the basic arithmetic methods?\n");
        double userInput1 = sc.nextDouble();
        double userInput2 = sc.nextDouble();
         */

        /*
        addition(userInput1, userInput2); // Calls "addition" method prioritizing the userInput as the parameter.
        subtraction(userInput1, userInput2); // Calls "subtraction" method prioritizing the userInput as the parameter.
        multiplication(userInput1, userInput2); // Calls "multiplication" method prioritizing the userInput as the parameter.
        division(userInput1, userInput2); // Calls "division" method prioritizing the userInput as the parameter.
        modulus(userInput1, userInput2); // Calls "division" method prioritizing the userInput as the parameter.
         */

        // Ex: 2
        /*
        Calls the prompt() function to ask the user for integer between 1-10.
        Once given the input, it will call the getInteger() function inside the prompt()
        and attempts to validate the user's input. If the user has a valid input,
        the prompt() function is completed. If the user input's a integer outside the valid conditions
        then we recall the prompt() function and restart the process.
        * ANALOGY: "A snake eating its own tail..." - kenneth(codeup instructor) *
        */
        // prompt();

        // Ex: 3
        factorialPrompt();
    }

    // For Exercise 1
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

    public static void modulus(double input1, double input2) {
        double sum = input1 % input2;
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Modulus: " + x + " / " + y + " = " + "%.0f%n", sum);
        } else {
            System.out.printf("Modulus: " + input1 + " / " + input2 + " = " + "%.2f%n", sum);
        }
    }

    // For Exercise 2
    public static void prompt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10:\n");
        int userInput = sc.nextInt();
        getInteger(userInput);
    }

    public static void getInteger(int input) {
        int min = 1;
        int max = 10;

        if (input < min || input > max) {
            System.out.println("Sorry, invalid error. Try again!");
            prompt();
        } else {
            System.out.println("Valid input!");
        }
    }

    // For Exercise 3
    public static void factorialPrompt() {
        Scanner fp = new Scanner(System.in);
        System.out.print("Please enter a integer from 1 to 10?\n");
        int userInput = fp.nextInt();
        factorialSolution(userInput);
    }

    public static void factorialSolution(int input) {
        Scanner fs = new Scanner(System.in);
        long fact = input;
        int min = 1;
        int max = 10;
        boolean confirm;

        if (input < min || input > max) {
            System.out.println("Sorry, invalid error. Try again!");
            factorialPrompt();
        } else {

            for (int i = 1; i <= input; i++) {
                fact *= i;
            }
            System.out.println(input + "! = " + fact);

            System.out.print("Would you like to continue? [y/N]\n");
            String keepGoing = fs.next();
            confirm = keepGoing.equalsIgnoreCase("y");
            if (confirm) {
                factorialPrompt();
            } else {
                System.out.println("Task completed!");
            }
        }
    }
}
