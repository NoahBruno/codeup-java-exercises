package grades;

import java.util.ArrayList;

public class student {



    private String name;
    private ArrayList <Integer> grade = new ArrayList<>();

    public student(String name){
        this.name = name;

    }


    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grade.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int holder = 0;
        for (int grades : grade){
            holder += grades;
        }
        int avg = holder / grade.size();
        return avg;

    }




}
