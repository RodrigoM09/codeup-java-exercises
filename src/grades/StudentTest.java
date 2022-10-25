package grades;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Rodrigo");
        Student student2 = new Student("Danny");
        Student student3 = new Student("David");
        Student student4 = new Student("Naz");
        List<Student> gradesArrayList = new ArrayList<>(List.of(student1, student2, student3, student4));
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(96);

        student2.addGrade(91);
        student2.addGrade(93);
        student2.addGrade(94);

        student3.addGrade(92);
        student3.addGrade(95);

        student4.addGrade(93);


        System.out.println(student1.getGradeAverage());

    }
}
