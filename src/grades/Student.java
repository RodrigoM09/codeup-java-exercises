package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // SETTER
    public void setName(String name){
        this.name = name;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    //GETTER

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.addAll(new ArrayList<>(List.of(grade)));
    }

    // RETURN AVERAGE OF THE STUDENTS GRADES.....
    public double getGradeAverage() {
        int total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return (double) total / grades.size();
    }
    // Default Constructor
    public Student(){};

    // Custom Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String toString(){
        return name;
    }

} // end of student class