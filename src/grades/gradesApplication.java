package grades;
import java.util.Scanner;
import java.util.HashMap;

public class gradesApplication {
    public static void main(String[] args){
        HashMap<String, student> students = new HashMap<>();
        student john = new student("john");
        john.addGrade(40);
        john.addGrade(50);
        john.addGrade(99);
//        System.out.println(john.getName());
//        System.out.println(john.getGradeAverage());
        student noah = new student("noah");
        noah.addGrade(101);
        noah.addGrade(99);
        noah.addGrade(120);
//        System.out.println(noah.getName());
//        System.out.println(noah.getGradeAverage());
        student billy = new student("billy");
        billy.addGrade(10);
        billy.addGrade(13);
        billy.addGrade(7);
        student jenny = new student("jenny");
        jenny.addGrade(73);
        jenny.addGrade(19);
        jenny.addGrade(45);
        students.put("johnnyjohn3000", john);
        students.put("TheG.O.A.T", noah);
        students.put("TrailerParkBilly", billy);
        students.put("PennyJenny", jenny);


        boolean confirm;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Here are the Github usernames of our students:");
            int i = 0;
            for(String name : students.keySet()){
                ++i;
                System.out.print(i + " ");
                System.out.println(name);
            }
            System.out.println();
            System.out.println("type the number corresponding to the Username to access that student");
            String info = scan.nextLine();
        if (info.equals("1")){
            System.out.println(students.get("johnnyjohn3000").getName());
            System.out.println("GradeAvg: " + students.get("johnnyjohn3000").getGradeAverage());
        }else if(info.equals("2")){
            System.out.println(students.get("PennyJenny").getName());
            System.out.println(students.get("PennyJenny").getGradeAverage());
        }else if(info.equals("3")){
            System.out.println(students.get("TheG.O.A.T").getName());
            System.out.println(students.get("TheG.O.A.T").getGradeAverage());
        }else if(info.equals("4")) {
            System.out.println(students.get("TrailerParkBilly").getName());
            System.out.println(students.get("TrailerParkBilly").getGradeAverage());

        }else{
            System.out.println("make sure its the one of the numbers above");
        }
            Scanner asks = new Scanner(System.in);
            System.out.println("Do you want to continue? [Y/N] ");
            String userConfirm = asks.next();
            confirm = userConfirm.equalsIgnoreCase("y");

    }while(confirm);
    }

}
