import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob: ");
         String userConvo = scanner.nextLine();
        if (userConvo.endsWith("?")){
            System.out.println( "Sure.");
        } else if (userConvo.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (userConvo.contains(" ")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");

            }
            System.out.print("Continue? (y/n): ");
            choice = scanner.next();
            System.out.println();
        }
    }
}
