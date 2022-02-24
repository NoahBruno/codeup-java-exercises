package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }
//
//    public String getString (){
//        return scanner.nextLine();
//    }
//
//    public boolean yesNo(){
//        if(scanner.hasNext("y")){
//            return true;
//        }else if(scanner.hasNext("yes")){
//            return true;
//        }else if(scanner.hasNext("Y")){
//            return true;
//        }else return scanner.nextLine().equalsIgnoreCase("Yes");
//    }
//
//    public int getInt(int min, int max){
//        int numInput;
//        do{
//            System.out.println("enter a number between 1 and 5");
//            numInput = scanner.nextInt();
//        }while(numInput < min || numInput > max);
//        System.out.println("good choice!");
//        return numInput;
//
//    }
//
//    public double getDouble(double min, double max){
//        double numInput2;
//        do{
//            System.out.println("enter a number between 1.00 and 1.50");
//            numInput2 = scanner.nextDouble();
//        }while(numInput2 < min || numInput2 > max);
//        System.out.println("good choice!");
//        return numInput2;
//
//    }

    public double getNum() {
        return scanner.nextDouble();
    }

    public boolean yN() {
        if (scanner.hasNext("y")) {
            return true;
        } else if (scanner.hasNext("Y")) {
            return true;
        } else return false;

    }
}


