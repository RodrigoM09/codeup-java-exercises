import java.util.Scanner;

public class StringsLecuture {
    public static void main(String[] args) {
        String javier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(javier))));

        String alsoJavier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        javier = javier + " Ruedas";
        String theOriginalJavier = "Javier";

        System.out.println(alsoJavier);
        System.out.println(javier);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String userName = scanner.next();
        System.out.println(theOriginalJavier == userName);
        // == WILL NOT WORK!
        System.out.println(theOriginalJavier.equals(userName));
    }
}
