import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(addition());
//        System.out.println(subtraction());
//        System.out.println(multiply());
//        System.out.println(divide());
//        System.out.println(modulus());
//        pickNumber(11);
        factorial();
//        diceSides();
//        guessMe();
//        runGame();
    }

    //    public static int addition(){
//        Scanner add = new Scanner(System.in);
//        System.out.println("Type two numbers to add:");
//        int one = add.nextInt();
//        int two = add.nextInt();
//        return one + two;
//    }
//    public static int subtraction(){
//        Scanner sub = new Scanner(System.in);
//        System.out.println("Type two numbers to subtract:");
//        int one = sub.nextInt();
//        int two = sub.nextInt();
//        return one - two;
//    }
//    public static int multiply(){
//        Scanner multi = new Scanner(System.in);
//        System.out.println("Type two numbers to multiply:");
//        int one = multi.nextInt();
//        int two = multi.nextInt();
//        return one * two;
//    }
//    public static int divide(){
//        Scanner div = new Scanner(System.in);
//        System.out.println("Type two numbers to divide:");
//        int one = div.nextInt();
//        int two = div.nextInt();
//        return one / two;
//    }
//public static void pickNumber(int n) {
//    if (n >= 1 && n <= 10) {
//        System.out.println("All done!");
//        return;
//    }
//        Scanner ask = new Scanner (System.in);
//        System.out.println("pick a number between 1 and 10:");
//        n = ask.nextInt();
//        System.out.println("try again!");
//        pickNumber(n);
//}
    public static void factorial(){
        Scanner ask = new Scanner(System.in);
        System.out.println("pick a number between 1 and 10");
        long num = ask.nextInt();
        if (num >= 1 && num <= 10) {
            System.out.println(num);
            Scanner again = new Scanner(System.in);
            System.out.println("do you want to continue with this number?[y/n]");
            String answer = again.nextLine();
            if (answer.equalsIgnoreCase("y")){
                long fact = 1;
                for (long i = 2; i <= num; i++){
                        fact = fact * i;
                        System.out.println("1 factorial of " + i + " = " + fact);
                    }
                }else{System.out.println("shoulda said yes!");
            }
    }
}
//    public static void diceSides() {
//        Scanner dice = new Scanner(System.in);
//        System.out.println("How many sides are on these 2 dice?");
//        int sides = dice.nextInt();
//        Scanner yesNo = new Scanner (System.in);
//        System.out.println("would you like to roll the dice?[y/n]");
//        String answer = yesNo.nextLine();
//        if (answer.equalsIgnoreCase("y")){
//            Random rand = new Random();
//            int rand_int1 = rand.nextInt(sides);
//            int rand_int2 = rand.nextInt(sides);
//            System.out.println(rand_int1);
//            System.out.println(rand_int2);
//        }else{
//            System.out.println("yes was the correct answer.");
//        }
//    }
//        public static void runGame() {
//            String another = "";
//            int answer, guess,attemptsNum = 0;
//            final int maxAttempts = 10;
//
//            Random generator = new Random();
//            answer = generator.nextInt(100)+1;
//
//            System.out.println("Guess a number between 1 and 100");
//            System.out.println("Enter your guess (0 to quit):");
//
//            guess = scan.nextInt();
//            while (guess != answer && attemptsNum < maxAttempts-1 && guess != 0 ) {
//                if(guess==answer)
//                    System.out.println("Right!");
//                else if (guess<answer) {
//                    System.out.println("Your guess was too LOW.");
//                    System.out.println("guess again! ");
//                    attemptsNum++;
//                    guess = scan.nextInt();
//                }
//                else {
//                    System.out.println("Your guess was too HIGH.");
//                    System.out.println("guess again! ");
//                    attemptsNum++;
//                    guess = scan.nextInt();
//                }
//            }
//
//            System.out.println ("The number was " + answer);
//            System.out.println("Want to Play again?(y/n)");
//            another = scan.next();
//            if(another.equals("y")) {
//                runGame();
//            } else {
//                System.out.println("Goodbye!");
//            }
//        }

}





