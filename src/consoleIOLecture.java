import java.util.Scanner;

public class consoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Wey-wot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;


//        System.out.printf("Good, %s %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("Will this be on a separate line?");
//        System.out.println("How about this?");
//        System.out.printf("The number is %08.2f%n", someNumber);
//        System.out.printf("The number is %-11.2f%n", someNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        //One of the ways to make console not skip first sentence after number is entered
        //Int userNumber = Integer.parseInt(scanner.nextLine());
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);


        System.out.println("Enter words:");
        //one of the ways to make console not skip first sentence after number is entered
        String userInput = scanner.nextLine() + scanner.nextLine();
        System.out.printf("Your words are %s.%n", userInput);
        //One of the ways to make console not skip first sentence after number is entered
        //String ghost = scanner.nextLine();

        System.out.println("Enter another sentence");
        String secondSentence = scanner.nextLine();
        System.out.printf("Your next words are %s.%n", secondSentence);

    }
}
