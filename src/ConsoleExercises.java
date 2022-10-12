import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The Value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);

        System.out.println("Enter 3 words:");
        String userInput = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.printf("Your first word, %s%n", userInput);
        System.out.printf("Your second word, %s%n", userInput2);
        System.out.printf("Your third word, %s%n", userInput3);

        String ghost = scanner.nextLine();
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence: %s", sentence);

        System.out.println("Enter the length and width:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int classArea = length * width;
        System.out.printf("The area of your room is: %s", classArea);


    }
}
