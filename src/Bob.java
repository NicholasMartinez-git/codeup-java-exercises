import java.util.Scanner; // Allows Scanner to function

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Allows code to accept user input

        System.out.println("Bob is a lackadaisical teenager." +
                " In conversation, his responses are very limited.");

        System.out.println("Would you like to talk with Bob? [y/N]");
        String userConfirm = sc.next();
        boolean confirm = userConfirm.equalsIgnoreCase("y");

        if (confirm) {
            System.out.println("Bob: Hello, to whoever is reading this.");
            System.out.println("Bob: What is your name?");
            String userName = sc.next();
            System.out.printf("Hi %s, nice chatting with you.", userName);
        } else {
            System.out.println("Bob: I didn't want to talk to you ether.");
        }
    }
}
