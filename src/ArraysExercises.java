import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // Person[] people = new Person[3];
        Person nic = new Person("nic");
        Person matt = new Person("matt");
        Person jon = new Person("jon");
        Person will = new Person("will");

        Person[] people = {nic, matt, jon, will};

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        addPerson(people, "pat");
    }

    public static void addPerson(Person[] people, String name) {
        Person[] personCopy = Arrays.copyOf(people, people.length + 1);
        personCopy[personCopy.length - 1] = new Person(name);
        for (Person person : personCopy) {
            System.out.println(person.getName());
        }
    }
}
