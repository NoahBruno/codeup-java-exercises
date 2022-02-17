import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        //1--------------------------------------------------------

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        //2--------------------------------------------------------

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("\nEnter something: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //3-----------------------------------------------------
//
//        Scanner newStrings = new Scanner (System.in);
//
//        System.out.print("\nEnter 3 words: ");
//        String oneWord = newStrings.next();
//        String twoWord = newStrings.next();
//        String threeWord = newStrings.next();
//
//        System.out.println("Your three words are:" + '\n' + oneWord +'\n' +  twoWord + '\n' + threeWord);

        //4-----------------------------------------------------

//        Scanner newSentenence = new Scanner (System.in);
//
//        System.out.print("\nEnter a sentence: ");
//        String words = newSentenence.nextLine();
//
//        System.out.println("Your three words are:" + words);

        //5------------------------------------------------------

//        Scanner newScan = new Scanner (System.in);
//
//        System.out.print("\nEnter length and height:");
//        int length = newScan.nextInt();
//        int width = newScan.nextInt();
//
//        System.out.println("Here is the Area: " + length * width);
//        System.out.println("Here is the Perimeter: " + ((length * 2) + (width * 2)) );

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is the length of the classroom?");
        String width = scanner.next();
        System.out.println("What is the width of the classroom?");
        String length = scanner.next();
        System.out.println("The area of the room is: " + Integer.parseInt(width) * Integer.parseInt(length) + "ft");
        System.out.println("The perimeter of the room is: " + 2*Integer.parseInt(width)+ 2*Integer.parseInt(length) + "ft");

    }
}
