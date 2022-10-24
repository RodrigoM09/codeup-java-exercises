package grades;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Rodrigo",90);
        Student student2 = new Student("Danny",80);
        Student student3 = new Student("David",70);
        Student student4 = new Student("Naz",99);
        List<Student> gradesArrayList = new ArrayList<>(List.of(student1, student2, student3, student4));
        System.out.println(gradesArrayList);
    }

}
