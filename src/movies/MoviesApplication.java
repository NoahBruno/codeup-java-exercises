package movies;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;
import static movies.MoviesArray.findAll;

public class MoviesApplication {
    private static Movie[] movieDB = findAll();

    public static Movie[] newArr(Movie[] movieArr, Movie title){
        Movie[] newMovies = Arrays.copyOf(movieArr, movieArr.length + 1);
        newMovies[newMovies.length - 1] = title;
        return newMovies;
    }

    public static void choiceOne() {

        for (Movie movie : movieDB) {
            System.out.println(movie.getName());
        }
    }

    public static void choiceTwo() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getMovieCategory(), "animated")) {
                System.out.println(movie.getName() + " -- " + movie.getMovieCategory());
            }
        }
    }

    public static void choiceThree() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getMovieCategory(), "drama")) {
                System.out.println(movie.getName() + " -- " + movie.getMovieCategory());
            }
        }
    }

    public static void choiceFour() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getMovieCategory(), "horror")) {
                System.out.println(movie.getName() + " -- " + movie.getMovieCategory());
            }
        }
    }

    public static void choiceFive() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getMovieCategory(), "scifi")) {
                System.out.println(movie.getName() + " -- " + movie.getMovieCategory());
            }
        }
    }

    public static void choiceSix() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getMovieCategory(), "comedy")) {
                System.out.println(movie.getName() + " -- " + movie.getMovieCategory());
            }
        }
    }

    public static void main(String[] args) {
        boolean confirm;
        do{
            Scanner ask = new Scanner(System.in);
            System.out.println("What you tryna do? cha feel dawg?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - view movies in the comedy category");
            System.out.println("Enter your choice number here: ");

        int answer = ask.nextInt();

            if (answer == 1) {
                choiceOne();
            } else if (answer == 2) {
                choiceTwo();
            } else if (answer == 3) {
                choiceThree();
            } else if (answer == 4) {
                choiceFour();
            } else if (answer == 5) {
                choiceFive();
            } else if (answer == 6) {
                choiceSix();
            }
            Scanner asks = new Scanner(System.in);
            System.out.println("Do you want to continue? [Y/N] ");
            String userConfirm = asks.next();
            confirm = userConfirm.equalsIgnoreCase("y");

    }while(confirm);


}
}
