public class Person {
    private String name;

    // Needed: Constructor that allows creation of a person
    public Person(String name) {
        this.name = name;
    }

    // Grabs the name placed/inputted within the constructor
    public String getName() {
        return this.name;
    }

    // Changes name of Person
    public void setName(String name) {
        this.name = name;
    }

    // Displays Hello to (name-of-person).name
    public void sayHello() {
        System.out.println("Hello, " + this.name + "!\n");
    }

    public static void main(String[] args) {
        Person nicholas = new Person("Nicholas"); // Uses constructor to create a new person called "nicholas"
        System.out.println(nicholas.getName()); // Displays name inputted into constructor
        nicholas.sayHello(); // Calls the method to display "Hello (this.name)"
        nicholas.setName("Nic"); // Changes name
        nicholas.sayHello(); // Calls the method to re-show the changes of the name
    }
}
