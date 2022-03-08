package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString (){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        if(scanner.hasNext("y")){
            return true;
        }else if(scanner.hasNext("yes")){
            return true;
        }else if(scanner.hasNext("Y")){
            return true;
        }else return scanner.nextLine().equalsIgnoreCase("Yes");
    }

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

    public int getInt(){
        try{
            return Integer.valueOf(getString());
        } catch (Exception e){
            System.out.println("Please enter an integer.");
            return getInt();
        }
    }

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

    public double getDouble(){
        try{
            scanner.nextLine(); //clear out the scanner from last time it used nextInt?
            return Double.valueOf(getString());
        } catch(Exception e){
            System.out.println("Please enter a decimal(double) number.");
            return getDouble();
        }
    }

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

    public int getBinary(){
        try{
            scanner.nextLine(); //clear out the scanner from last time it used nextInt?
            return Integer.valueOf(getString(), 2);
        } catch(Exception e){
            System.out.println("Please enter a valid number");
        }
        return getBinary();
    }

    public int getHexadecimal(){
        try{
            return Integer.valueOf(getString(), 16);
        } catch(Exception e){
            System.out.println("Please enter a valid entry.");
        }
        return getHexadecimal();
    }
}


