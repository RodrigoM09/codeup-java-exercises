import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
       String javier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(javier))));

       String alsoJavier = "Javier";

        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

       javier = javier + " Ruedas";
       alsoJavier = javier;

        System.out.println(alsoJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString(System.identityHashCode(javier)));
        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

        String letsTryThis = "Javier";
        System.out.println(Integer.toHexString(System.identityHashCode(letsTryThis)));

        String theOriginalJavier = "Javier";

        System.out.println(letsTryThis == theOriginalJavier);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scanner.nextLine();
//        System.out.println(theOriginalJavier == userName);
//        System.out.println(theOriginalJavier.equals(userName));
        System.out.println(javier.equals(userName));
        System.out.println(javier);

    }
}

