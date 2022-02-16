public class HelloWorld {
    public static void main (String[] args){
        System.out.print("Hello, World!");

        int myFavoriteNumber =17;
        System.out.println(myFavoriteNumber);

        String myString = "hi";
        System.out.println(myString);

        double myNumber= 3.14;
        System.out.print(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(y++);
//        System.out.println(y);
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        int z = 4;
//        x = x + 5;
        z += 5;
        System.out.println("4 + 5 = " + z);

        int n = 3;
        int m = 4;
        m *= n;
        System.out.println("3 x 4 = " + m);

        int o = 10;
        int p = 2;
        o /= p;
        p -= o;
        System.out.println("10 / 2 = " + o);
        System.out.println("2 - 5 = " + p);

    }
}

