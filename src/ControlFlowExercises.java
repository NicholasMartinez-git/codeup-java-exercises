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
        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
