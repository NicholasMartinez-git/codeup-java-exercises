package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner; // Allows Scanner to function

public class GradesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student nic = new Student("Nic");
        Student matt = new Student("Matt");
        Student jon = new Student("Jon");
        Student will = new Student("Will");

        students.put("Nic_Sighs", nic);
        students.put("mattinthehat", matt);
        students.put("IownaSubaru", jon);
        students.put("thrilliam", will);

        nic.addGrade(100);
        nic.addGrade(98);
        nic.addGrade(93);
        nic.addGrade(70);

        matt.addGrade(81);
        matt.addGrade(92);
        matt.addGrade(83);
        matt.addGrade(79);

        jon.addGrade(94);
        jon.addGrade(89);
        jon.addGrade(99);
        jon.addGrade(82);

        will.addGrade(99);
        will.addGrade(97);
        will.addGrade(96);
        will.addGrade(98);

        // First we declare a list that contains all of the keys of our current HashMap
        String[] listOfKeys = students.keySet().toArray(new String[0]);
        // System.out.println(Arrays.toString(listOfKeys));
        // We create a for loop that will iterate through all keys
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String key : listOfKeys) {
            System.out.print("|" + key + "| ");
        }
        System.out.println();

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = sc.next();
            if (!students.containsKey(userInput)) {
                System.out.printf("Sorry, no student found with the username of \"%s\"%n%n", userInput);
            }
            for (String key : listOfKeys) {
                if (userInput.equalsIgnoreCase(key)) {
                    System.out.printf("Name: %s - GitHub Username: %s%n" +
                            "Current Average: %.2f%n", students.get(key).getName(), key, students.get(key).getGradeAverage());
                }
            }

            System.out.println("Would you like to see another student? [y/N]");
            String answer = sc.next();
            keepGoing = answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");

            if (!keepGoing) {
                System.out.println("\nGoodbye, and have a wonderful day!");
            }
        }
    }
}
