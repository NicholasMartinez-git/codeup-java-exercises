import java.util.Scanner; // Allows Scanner to function

public class HighLow {
    public static void main(String[] args) {
        System.out.print("""
                Welcome to the mini game called GUESS!
                
                HOW TO WIN: Guess the correct number within 3 attempts!
                
                Instructions:
                (1) The game's program will randomly generate a number from 1-100
                (2) You will then start entering numbers one at a time.
                    (2a) The program will then clarify if the current input is *Too High(TH)*, *Too Low(TL)*, or *Correct!*
                    (2b) If you receive (TH) or (TL) repeat step (2).
                (3) If you receive *Correct!* then congratulations you've GUESSed the right number!
                (4) Once you receive the *Correct!* indicator please enter the letter (n) to see your results.
                
                Reminder: YOU ONLY WIN IF YOU GUESS WITHIN 3 ATTEMPTS!
                
                So without further ado!...
                
                """);

        int randomPick, currentGuess;
        int guessCount = 0;
        boolean incorrect = true;
        randomPick = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);

        while(incorrect) {
            Scanner sc = new Scanner(System.in);
            guessCount = guessCount + 1;

            System.out.println("Please enter your GUESS: ");
            currentGuess = sc.nextInt();

            if (currentGuess < 1 || currentGuess > 100) {
                guessCount = guessCount - 1;
                System.out.println("Invalid input. Please try again!");
            } else if (currentGuess > randomPick) {
                System.out.println("Too High(TH)");
            } else if (currentGuess < randomPick) {
                System.out.println("Too Low(TL)");
            } else if (currentGuess == randomPick) {
                System.out.println("Correct!");
                System.out.println("Congratulations! You've GUESSed the right number.");
                incorrect = false;
            }
        }

        System.out.println("It took you " + guessCount + " attempts.");

        if (guessCount <= 3) {
            System.out.println("You are a winner!");
            System.out.println("Now brag to all you're friends and challenge them (;");
        } else if (guessCount <= 6) {
            System.out.println("So close! First is the worst, second is the best, third is the...");
        } else if (guessCount <= 10) {
            System.out.println("Good try! I also got a participation ribbon once.");
        } else if (guessCount <= 13) {
            System.out.println("Oof! Do I dare say try again");
        } else if (guessCount <= 16) {
            System.out.println("Who knew guessing a number would be so difficult.");
        } else if (guessCount <= 20) {
            System.out.println("Don't show this to your friends");
        } else if (guessCount <= 100) {
            System.out.println("My battery is low and it's getting dark.");
        }
    }
}
