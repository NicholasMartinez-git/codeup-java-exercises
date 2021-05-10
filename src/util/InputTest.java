package util;

public class InputTest {
    public static void main(String[] args) {
//         String str = "What is your name?";
//         System.out.println(str);
//         String response = Input.getString();
//         System.out.println("Hello, " + response);
//
//         System.out.println("Input.getString(str) = " + Input.getString(str));
//         System.out.println(str);
//
//        String integerStr;
//        int answer;
//
//        try {
//            integerStr = "How old are you?";
//            System.out.println(integerStr);
//            answer = Input.getInt();
//            System.out.println("That is an Integer!");
//        } catch (Exception e) {
//            System.out.println("You did not enter a integer");
//        }

//        String promptInteger = "Please enter an integer: ";
//        System.out.println(promptInteger);
//        int answer = Input.getInt();
//        System.out.printf("Thank you for entering %s integer!", answer);

        System.out.println(Input.getInt(1, 10));

    }
}
