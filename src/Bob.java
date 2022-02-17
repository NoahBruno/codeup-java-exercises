import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner ask = new Scanner (System.in);

        boolean confirm;
        do {
            System.out.print("What do you want to say to bob?");
            String what = ask.nextLine();

            if (what.endsWith("?")) {
                System.out.println("sure");
            } else if (what.endsWith("!")) {
                System.out.println("Whoa! Chill out!");
            } else if (what.equals("")) {
                System.out.println("Whatever");
            } else {
                System.out.println("Fine, be that way!");
            }
            System.out.print("Do you want to keep chatting with Bob?");
            String keepChat = ask.nextLine();
            confirm= keepChat.equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("see ya!");

    }
}
