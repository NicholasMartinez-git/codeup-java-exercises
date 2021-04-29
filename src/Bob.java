import java.util.Scanner; // Allows Scanner to function

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Allows code to accept user input

        System.out.println("Bob is a lackadaisical teenager. " +
                           "In conversation, his responses are very limited."); // Description of Bob

        System.out.println("Would you like to talk with Bob? [y/N]"); // Prompts user
        String userConfirm = sc.next(); // Stores answer
        boolean confirm = userConfirm.equalsIgnoreCase("y"); // Converts answer into boolean

        if (confirm) {
            // If confirm = true. Run this code/conversation
            System.out.println("Bob: Hello, to whoever is reading this.");
            System.out.println("Bob: What is your name?"); // Prompts user
            String userName = sc.next(); // Stores only first name
            System.out.printf("Hi %s, nice chatting with you.", userName);
        } else {
            // If confirm = false. End conversation
            System.out.println("Bob: I didn't want to talk to you ether.");
        }
    }
}
