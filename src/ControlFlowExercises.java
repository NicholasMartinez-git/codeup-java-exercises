import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1a.
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // 1b.

//        int i = 0;
//        do {
//            i += 2;
//
//            System.out.print(i + " ");
//        } while (i < 100);

//        int i = 100;
//        do {
//            System.out.print(i + " ");
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 65536);

        // ic.
//        for (long i = 100; i >= -10; i -=5){
//            System.out.println(i);
//        }
//
//
//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

        // 2
//        for (int i = 1; i <= 100; i++) {
////            System.out.println(i);
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 3
        Scanner sc = new Scanner(System.in);

        System.out.println("What number would you like to go up? ");
        int upToUserInput = sc.nextInt();

        System.out.println("Here is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= upToUserInput; i++ ) {
            double squared = Math.pow(i, 2);
            double cubed = Math.pow(i, 3);
            int sq = (int) squared;
            int cu = (int) cubed;
            System.out.printf("%s     | %s      | %s    \n", i, sq, cu);
        }

        System.out.print("Continue? [y/N]\n");
        String userInput = sc.next();
        boolean confirm = userInput.equalsIgnoreCase("y");
    }
}
