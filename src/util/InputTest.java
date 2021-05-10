package util;

public class InputTest {
    public static void main(String[] args) {
        String str = "What is your name?";
        System.out.println(str);
        String response = Input.getString();
        System.out.println("Hello, " + response);

        // System.out.println("Input.getString(str) = " + Input.getString(str));
        // System.out.println(str);
    }
}
