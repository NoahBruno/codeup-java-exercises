package rps;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {



        boolean confirm;
       do{
           Random rand = new Random();
           String[] rps = {"r","p","s"};
           String computerMove = rps[rand.nextInt(rps.length)];
        Scanner ask = new Scanner(System.in);
        System.out.println("pick: " +
                "r for Rock " +
                "p for paper " +
                "s for scissors");
        String answer = ask.nextLine();
        if (answer.equalsIgnoreCase("r") && computerMove.equalsIgnoreCase("p")){
            System.out.println("loser!");
        }else if(answer.equalsIgnoreCase("p") && computerMove.equalsIgnoreCase("s")){
            System.out.println("loser!");
        }else if(answer.equalsIgnoreCase("s") && computerMove.equalsIgnoreCase("r")){
            System.out.println("lose!");
        }else if (answer.equalsIgnoreCase("r") && computerMove.equalsIgnoreCase("s")){
            System.out.println("Weiner!");
        }else if(answer.equalsIgnoreCase("p") && computerMove.equalsIgnoreCase("r")){
            System.out.println("Weiner Weiner!");
        }else if(answer.equalsIgnoreCase("s") && computerMove.equalsIgnoreCase("p")){
            System.out.println("Winnnnnnnnn!");
        }else if(answer.equals(computerMove)){
            System.out.println("Tie! try again!");
        }
        Scanner askAgain = new Scanner(System.in);
           System.out.println("Wanna play again? [y/n]");
        String answering = askAgain.nextLine();
        confirm = answering.equalsIgnoreCase("y");


        }while(confirm);
    }
}
