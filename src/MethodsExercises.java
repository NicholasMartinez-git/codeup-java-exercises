import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ex: 1
        /* We are asking the user for 2 numbers to utilize for our basic arithmetic methods

        System.out.print("Please enter 2 numbers you would like to run through the basic arithmetic methods?\n");
        double userInput1 = sc.nextDouble();
        double userInput2 = sc.nextDouble();

        addition(userInput1, userInput2);
        subtraction(userInput1, userInput2);
        multiplication(userInput1, userInput2);
        division(userInput1, userInput2);
        modulus(userInput1, userInput2);

         */


        // Ex: 2
        /*
        Calls the prompt() function to ask the user for integer between 1-10.
        Once given the input, it will call the getInteger() function inside the prompt()
        and attempts to validate the user's input. If the user has a valid input,
        the prompt() function is completed. If the user input's a integer outside the valid conditions
        then we recall the prompt() function and restart the process.
        * ANALOGY: "A snake eating its own tail..." - kenneth(codeup instructor) *

        prompt();

         */

        // Ex: 3
        /*
        Calls the factorialPrompt() function to ask the user for integer between 1-10.
        Once given the input, it will call the factorialSolution() function inside the factorialPrompt()
        and attempts to validate the user's input. If the user has a valid input,
        the function will run accordingly and display the factorial(n!) solution of said input

        factorialPrompt();
         */

        // Ex: 4
        // dicePrompt();
    }

    // For Exercise 1
    public static void addition(double input1, double input2) {
        double sum = input1 + input2; // adds each parameter together

        // valdiates if the parameters are whole or have decimals
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            // If both parameters are whole. Output will display without decimals.
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Addition: " + x + " + " + y + " = " + "%.0f%n", sum);
        } else {
            // If parameters have decimals. Output will display with decimals.
            System.out.printf("Addition: " + input1 + " + " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void subtraction(double input1, double input2) {
        double sum = input1 - input2; // subtracts each parameter together

        // valdiates if the parameters are whole or have decimals
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            // If both parameters are whole. Output will display without decimals.
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Subtraction: " + x + " - " + y + " = " + "%.0f%n", sum);
        } else {
            // If parameters have decimals. Output will display with decimals.
            System.out.printf("Subtraction: " + input1 + " - " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void multiplication(double input1, double input2) {
        double sum = input1 * input2; // multiplies each parameter together

        // valdiates if the parameters are whole or have decimals
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            // If both parameters are whole. Output will display without decimals.
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Multiplication: " + x + " x " + y + " = " + "%.0f%n", sum);
        } else {
            // If parameters have decimals. Output will display with decimals.
            System.out.printf("Multiplication: " + input1 + " x " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void division(double input1, double input2) {
        double sum = input1 / input2; // divides each parameter by eachother

        // valdiates if the parameters are whole or have decimals
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            // If both parameters are whole. Output will display without decimals.
            int x = (int) input1;
            int y = (int) input2;

            // validates sum of parametes are whole or have decimals. Display's accordingly.
            if (sum % 1 == 0) {
                System.out.printf("Division: " + x + " / " + y + " = " + "%.0f%n", sum);
            } else {
                System.out.printf("Division: " + x + " / " + y + " = " + "%.2f%n", sum);
            }
        } else {
            // If parameters have decimals. Output will display with decimals.
            System.out.printf("Division: " + input1 + " / " + input2 + " = " + "%.2f%n", sum);
        }
    }

    public static void modulus(double input1, double input2) {
        double sum = input1 % input2; // divides the parameters => (sum = remainder of parameters)

        // validates sum of parametes are whole or have decimals. Display's accordingly.
        if (input1 % 1 == 0 && input2 % 1 == 0) {
            // If both parameters are whole. Output will display without decimals.
            int x = (int) input1;
            int y = (int) input2;
            System.out.printf("Modulus: " + x + " / " + y + " = " + "%.0f%n", sum);
        } else {
            // If parameters have decimals. Output will display with decimals.
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

    // For Exercise 4
    public static void dicePrompt() {
        Scanner dp = new Scanner(System.in);
        System.out.print("Please enter the number of sides for a each of die?\n");
        int sidesOfDie1 = dp.nextInt();
        int sidesOfDie2 = dp.nextInt();
        System.out.print("Would you like to roll the dice? [y/N]\n");
        String rollDice = dp.next();
        boolean confirm = rollDice.equalsIgnoreCase("y");
        if (confirm) {
            diceRoll(sidesOfDie1, sidesOfDie2);
        } else {
            System.out.println("Maybe next time!");
        }

    }

    public static void diceRoll(int sidesOfDie1, int sidesOfDie2) {
        Scanner dr = new Scanner(System.in);
        boolean taskIncomplete = true;

        do {
            int dieRoll1 = (int) (Math.random() * sidesOfDie1 - 1 + 1) + 1;
            int dieRoll2 = (int) (Math.random() * sidesOfDie2 - 1 + 1) + 1;
            int roll = (dieRoll1 + dieRoll2);

            System.out.println("You rolled a " + roll);
            System.out.println(sidesOfDie1 + " sided die rolled a " + dieRoll1);
            System.out.println(sidesOfDie2 + " sided die rolled a " + dieRoll2);

            System.out.print("Would you like to roll again? [y/N]\n");
            String rollAgain = dr.next();
            boolean confirmRoll = rollAgain.equalsIgnoreCase("y");
            if (confirmRoll == false){
                System.out.println("Task Completed!");
                break;
            }
            System.out.print("Would you like to change dice? [y/N]\n");
            String changeDice = dr.next();
            boolean confirmDice = changeDice.equalsIgnoreCase("y");

            if (confirmRoll && confirmDice) {
                dicePrompt();
                taskIncomplete = false;
            } else if (confirmRoll && confirmDice == false){
                taskIncomplete = true;
            }
        } while (taskIncomplete);
    }
}
