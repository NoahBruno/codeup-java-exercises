import java.util.Scanner;
public class lecture {
//    public static int sumALl(){
//        int[] numbers = {1,2,3,4};
//        int sum = 0;
//        for(int n : numbers){
//            sum += n;
//        }
//        return sum;
//    }

    public static int sum(){
        int[] num = {1,2,3,4,5,6};
        int e = 0, o=0;
        for (int j : num){
            if (j % 2 == 0){
                e = e + j;
            }else {
                o = o + j;
            }
        }return e;
    }

    public static void main(String[] args) {
//        System.out.println(sumALl());
        System.out.println(sum());
//        System.out.println(num());
//        System.out.println(user());
//        String[] weather = new String[3];
//        weather[0]= "sunny";
//        weather[1]="rainy";
//        weather[2]="cloudy";
//        System.out.println(weather[0]);
//        System.out.println(weather[1]);
//        System.out.println(weather[2]);
    }
//    public static String user(){
//        Scanner ask = new Scanner(System.in);
//        System.out.println("What is your username?");
//        String userInput = ask.nextLine();
//        return "hello, " + userInput;
//
//    }
//    public static int num(){
//        Scanner number =new Scanner(System.in);
//        System.out.println("type in 2 numbers");
//        int one = number.nextInt();
//        int two =number.nextInt();
//        return one + two;
//    }
}
