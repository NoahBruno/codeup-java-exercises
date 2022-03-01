package movies;

public class Movie {
    private String movieName;
    private String movieCategory;

    public String getName() {
        return this.movieName;
    }

    public void setName(String name) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public Movie(String movieName, String movieCategory){
        this.movieName = movieName;
        this.movieCategory = movieCategory;
    }
}
