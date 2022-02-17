public class ControlFlowExercises {
    public static void main(String[] args) {

        //1-----------------------------------------
        int i =5;
        while(i < 15){
            System.out.println("i is "+ i);
            i++;
        }

        //2-----------------------------------------
        int p = 100;
        do{
            p -= 5;
            System.out.println("numbers " + p);
        }while(p > -10);

        //3-------------------------------------------
        int x= 2;
        do{
            x*=2;
            System.out.println("number square " + x);
        }while(x <100);

        //4--------------------------------------------


    }
}
