import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition());
//        System.out.println(subtraction());
//        System.out.println(multiply());
//        System.out.println(divide());
//        System.out.println(modulus());
//        pickNumber(11);
        factorial();
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
public static void pickNumber(int n) {
    if (n >= 1 && n <= 10) {
        System.out.println("All done!");
        return;
    }
        Scanner ask = new Scanner (System.in);
        System.out.println("pick a number between 1 and 10:");
        n = ask.nextInt();
        System.out.println("try again!");
        pickNumber(n);
}
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
                for (long i = 1; i <= num; i++){
                    for (int j= 2; j <= num; j++){

                        System.out.println(i);
                    }
                }
            }
        }

    }

}
