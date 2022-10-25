package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userNameInput;
        Student student1 = new Student("Rodrigo");
        Student student2 = new Student("Danny");
        Student student3 = new Student("David");
        Student student4 = new Student("Naz");
        student1.addGrade(90);
        student1.addGrade(89);
        student1.addGrade(87);
        student2.addGrade(90);
        student2.addGrade(89);
        student2.addGrade(87);
        student3.addGrade(90);
        student3.addGrade(89);
        student3.addGrade(87);
        student4.addGrade(90);
        student4.addGrade(89);
        student4.addGrade(87);
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("RodrigoM09", student1);
        studentHashMap.put("Trickzilla", student2);
        studentHashMap.put("Goliath", student3);
        studentHashMap.put("NastyNaz", student4);

        System.out.printf("Welcome!%n");
        System.out.printf("Here are the GitHub usernames of our students: %n");
        List<String> studentNames = new ArrayList<>(studentHashMap.keySet().stream().toList());
        for (String name : studentNames) {
            System.out.printf("|%s|", name);
        }
        Input input = new Input();
        String userAnswer;
        do {
            System.out.printf("%nWhat student would you like to see more information on?%n");
            userNameInput = scanner.nextLine();
            if (studentHashMap.containsKey(userNameInput)) {
                Student newStudentLookUp = studentHashMap.get(userNameInput);
                System.out.printf("Name: %s - GitHub UserName:%n%s Current Average: %.2f%n", newStudentLookUp, userNameInput, newStudentLookUp.getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s", userNameInput);
            }
            System.out.println("Would you like to see another student? y/n");
            userAnswer = scanner.nextLine();
        } while (userAnswer.equals("y"));
        if (userAnswer.equals("n")) {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }
}
