package movies;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("What you tryna do? cha feel dawg?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("Enter your choice number here: ");
        String answer = ask.nextLine();


    }
}
