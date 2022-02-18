import java.util.Scanner;
public class lecture {
    public static void main(String[] args) {
        System.out.println(num());
        System.out.println(user());
    }
    public static String user(){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is your username?");
        String userInput = ask.nextLine();
        return "hello, " + userInput;

    }
    public static int num(){
        Scanner number =new Scanner(System.in);
        System.out.println("type in 2 numbers");
        int one = number.nextInt();
        int two =number.nextInt();
        return one + two;
    }
}
