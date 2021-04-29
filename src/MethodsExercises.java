import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ex: 1
        // We are asking the user for 2 numbers to utilize for our basic arithmetic methods
        // Uncomment => "/* */" below to run code
        /*
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
        Usuage: Creates a method that validates the user's input is in a certain range.
        */
        // UNCOMMENT BELOW TO RUN CODE:
        // prompt();



        // Ex: 3
        /*
        Usage: Calculates the factorial of a integer
        */
        // UNCOMMENT BELOW TO RUN CODE:
        // factorialPrompt();

        // Ex: 4
        /*
        Usage: Creates an applocation that stimulates dice rolling
               -Assumes only a pair of dice will be rolled
        */
        // UNCOMMENT BELOW TO RUN CODE:
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
        Scanner sc = new Scanner(System.in); // Allows code to accept user input
        System.out.print("Please enter a number between 1 and 10:\n"); // Prompts question
        int userInput = sc.nextInt(); // Stores user input
        getInteger(userInput); // Calls method/function to validate user's input
    }

    public static void getInteger(int input) {
        int min = 1;
        int max = 10;

        // validates input is with min to max
        if (input < min || input > max) {
            // Re-prompts question if input is invalid
            System.out.println("Sorry, invalid error. Try again!");
            prompt();
        } else {
            // Input is within range
            System.out.println("Valid input!");
        }
    }

    // For Exercise 3
    public static void factorialPrompt() {
        Scanner fp = new Scanner(System.in); // Allows code to accept user input
        System.out.print("Please enter a integer from 1 to 10?\n"); // Prompts question
        int userInput = fp.nextInt(); // Stores user input

        // Calls method/function to validate and calculate user's input
        factorialSolution(userInput);
    }

    public static void factorialSolution(int input) {
        Scanner fs = new Scanner(System.in); // Allows code to accept user input

        long fact = input; // changes input into larger primitive data type
        int min = 1;
        int max = 10;
        boolean confirm;

        // validates input is with min to max
        if (input < min || input > max) {
            // Re-prompts question if input is invalid
            System.out.println("Sorry, invalid error. Try again!");
            factorialPrompt();
        } else {
            // Input is within range.
            for (int i = 1; i <= input; i++) {
                // multiples the input(fact) by each interger(i) until loop ends.
                fact *= i;
            }
            System.out.println(input + "! = " + fact); // Displays results

            System.out.print("Would you like to continue? [y/N]\n"); // Asks user to continue
            String keepGoing = fs.next(); // Stores user input
            confirm = keepGoing.equalsIgnoreCase("y"); // initializes boolean confirm with user's input
            if (confirm) {
                // Re-starts the entire process of validation and calculating
                factorialPrompt();
            } else {
                System.out.println("Task completed!");
            }
        }
    }

    // For Exercise 4
    public static void dicePrompt() {
        Scanner dp = new Scanner(System.in); // Allows code to accept user input
        System.out.print("Please enter the number of sides for a each of die?\n"); // Prompts question
        int sidesOfDie1 = dp.nextInt(); // Stores first die input
        int sidesOfDie2 = dp.nextInt(); // Stores second die input
        System.out.print("Would you like to roll the dice? [y/N]\n"); // Prompts confirm question
        String rollDice = dp.next(); // Stores answer input
        boolean confirm = rollDice.equalsIgnoreCase("y"); // initializzes boolean confirm with user's input
        if (confirm) {
            // Calls the method/function to produce a random roll
            diceRoll(sidesOfDie1, sidesOfDie2);
        } else {
            // Exits method
            System.out.println("Maybe next time!");
        }

    }

    public static void diceRoll(int sidesOfDie1, int sidesOfDie2) {
        Scanner dr = new Scanner(System.in); // Allows code to accept user input
        boolean taskIncomplete = true; // initiation for do-while loop: Can only exit if this equals false.

        do {
            int dieRoll1 = (int) (Math.random() * sidesOfDie1 - 1 + 1) + 1; // generates random number for first die
            int dieRoll2 = (int) (Math.random() * sidesOfDie2 - 1 + 1) + 1; // generates random number for second die
            int roll = (dieRoll1 + dieRoll2); // sum of both die rolled

            // Display for input above ^
            System.out.println("You rolled a " + roll);
            System.out.println(sidesOfDie1 + " sided die rolled a " + dieRoll1);
            System.out.println(sidesOfDie2 + " sided die rolled a " + dieRoll2);

            System.out.print("Would you like to roll again? [y/N]\n"); // Prompts rollAgain question
            String rollAgain = dr.next(); // Stores answer input
            boolean confirmRoll = rollAgain.equalsIgnoreCase("y"); // initializzes boolean confirmRoll with user's input
            if (confirmRoll == false){
                // Exits method if answer input is no
                System.out.println("Task Completed!");
                break;
            }
            System.out.print("Would you like to change dice? [y/N]\n"); // Prompts change dice question
            String changeDice = dr.next(); // Stores answer
            boolean confirmDice = changeDice.equalsIgnoreCase("y"); // initializzes boolean confirmDice with user's input

            // Validates the previous two questions
            if (confirmRoll && confirmDice) {
                // if both questions are true: Re-starts the entire process of picking dice and re-roll
                dicePrompt();
                taskIncomplete = false;
            } else if (confirmRoll && confirmDice == false) {
                // If ONLY confrimRoll equals true: restart the do-while loop
                taskIncomplete = true;
            }
        } while (taskIncomplete);
    }
}
