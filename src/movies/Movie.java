package movies;

public class Movie {
    private String name;
    private String category;

    public void getMovie(String name, String category) {
        setName(name);
        setCategory(category);
    }

    // getters
    public static String getName(Movie ele) {
        return ele.name;
    }
    public static String getCategory(Movie ele) {
        return ele.category;
    }

    //changes movie info, setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
