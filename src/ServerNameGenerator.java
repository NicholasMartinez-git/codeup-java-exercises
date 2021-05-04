import java.util.Random;

public class ServerNameGenerator {
    static Random random = new Random();

    public static void main(String[] args) {
        String[] adjectives = {"attractive", "agreeable", "angry", "big", "ambitious", "brave", "calm", "eager", "gentle", "happy"};
        String[] nouns = {"apple", "bookcase", "brass", "couch", "cave", "crest", "bridge", "coffee", "ankle", "architect"};

        System.out.printf("This is a random adjective: %s%n", getRandomElement(adjectives));

        System.out.printf("This is a random noun: %s%n", getRandomElement(nouns));
    }

    public static String getRandomElement(String[] array) {
        int index = random.nextInt(array.length - 1);
        return array[index];
    }
}
