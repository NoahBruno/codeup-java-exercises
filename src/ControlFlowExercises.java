import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        //1--------------------------------------------
//        int i =5;
//        while(i < 15){
//            System.out.println("i is "+ i);
//            i++;
//        }
//
//        //2--------------------------------------------
//        int p = 100;
//        do{
//            p -= 5;
//            System.out.println("numbers " + p);
//        }while(p > -10);
//
//        //3--------------------------------------------
        long x= 2;
        do{
            x*=x;
            System.out.println("number square " + x);
        }while(x <10000);
//
//        //4--------------------------------------------
//        for (int j = 100; j > -11; j-=5){
//            System.out.println("this number: " + j);
//        }
//        //5--------------------------------------------
        for (long k = 2; k < 100000; k*=k){
            System.out.println("count square: " + k);
        }
//
//        //6--------------------------------------------
//        for (int f = 0; f <= 100; f++){
//            if(f % 15 == 0){
//                System.out.println("FizzBuzz: " + f);
//            }else if (f % 5 == 0){
//                System.out.println("Buzz: " + f);
//            }else if (f % 3 == 0){
//                System.out.println("Fizz: " + f);
//            }
//        }
        //7---------------------------------------------
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("enter a number here: ");
//        int n = scanner.nextInt();
//        System.out.format("number | squared | cubed");
//        System.out.format("\n------ | ------- | -----");
//        int i =1;
//        while(i <= n) {
//            System.out.format("\n" + i + "      | " + i * i + "       | " + i * i * i);
//            i++;
//        }
        //8----------------------------------------------
//        Scanner grades = new Scanner(System.in);
//        int x = 0;
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.println("Entre a numeric grade between 0 and 100: ");
//            x = grades.nextInt();
//            if (x >= 0 && x <= 100)
//                if (x <= 100 && x >= 96) {
//                    System.out.println("A+");
//                } else if (x <= 95 && x >= 92) {
//                    System.out.println("A");
//                } else if (x <= 91 && x >= 90) {
//                    System.out.println("A-");
//                } else if (x <= 89 && x >= 86) {
//                    System.out.println("B+");
//                } else if (x <= 85 && x >= 80) {
//                    System.out.println("B");
//                } else if (x <= 79 && x >= 76) {
//                    System.out.println("C+");
//                } else if (x <= 75 && x >= 70) {
//                    System.out.println("C");
//                } else if (x <= 69 && x >= 66) {
//                    System.out.println("D+");
//                } else if (x <= 65 && x >= 60) {
//                    System.out.println("D");
//                } else if (x <= 59 && x >= 0) {
//                    System.out.println("F");
//                }
//            System.out.print("\nContinue? (y/n): ");
//            choice = grades.next();
//            System.out.println();
//        }
//



    }
}
