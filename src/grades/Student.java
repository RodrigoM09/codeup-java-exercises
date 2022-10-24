package grades;

import java.util.ArrayList;
public class Student {
    private String name;
    private Double grade;
    ArrayList<Integer> gradesArrayList = new ArrayList<>();

    // returns the student's name
    public String getName() {
        return name;
    }
    public Double getGrade(){
        return grade;
    }

    // adds the given grade to the grades property
    public double addGrade(double grade) {
        return grade;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        for (double i = 0; i < gradesArrayList.size(); i++){
            System.out.println(gradesArrayList.get((int) i));
        }
        return 0;
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return name;
    }
}
