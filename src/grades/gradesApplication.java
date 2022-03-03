package grades;

import java.util.HashMap;

public class gradesApplication {
    public static void main(String[] args){
        HashMap<String, student> students = new HashMap<>();
        student john = new student("john");
        john.addGrade(40);
        john.addGrade(50);
        john.addGrade(99);
        System.out.println(john.getName());
        System.out.println(john.getGradeAverage());
        student noah = new student("noah");
        noah.addGrade(101);
        noah.addGrade(99);
        noah.addGrade(120);
        System.out.println(noah.getName());
        System.out.println(noah.getGradeAverage());
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
        System.out.println(students);
    }
}
