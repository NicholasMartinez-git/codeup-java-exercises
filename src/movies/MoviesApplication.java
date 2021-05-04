package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] viewMovies = MoviesArray.findAll();

        System.out.print("""
                What would you like to do?
                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                """);
        int userInput = Input.getInt("Please enter answer here: ");

        if (userInput < 0 || userInput > 5) {
            System.out.println("Invalid input. Please try again!");
        } else if (userInput == 0) {
            System.out.println("Maybe next time. Goodbye!");
        } else if (userInput == 1) {
            for (int i = 0; i < viewMovies.length; i++) {
                System.out.printf("Movie: %s, %s%n", Movie.getName(viewMovies[i]), Movie.getCategory(viewMovies[i]));
            }
        }
    }
}
