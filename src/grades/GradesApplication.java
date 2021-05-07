package grades;

import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(listOfKeys));
        // We create a for loop that will iterate through all keys
        for (String key : listOfKeys) {
            System.out.println(key + "=" + students.get(key).getName());
        }
    }
}
