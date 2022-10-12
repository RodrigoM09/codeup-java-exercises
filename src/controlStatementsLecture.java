import java.sql.SQLOutput;
import java.util.Scanner;

public class controlStatementsLecture {

        //Statements
        int myInteger = 20;
    public static void main(String[] args) {
        int x = 6;
        if(x == 5){
            System.out.println("x is 5");
        } else if (x > 5 && x < 15){
            System.out.println("x is between 5 and 15");
        }
        String customerChoice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor do you want?");
        customerChoice = scanner.next().toLowerCase();

        switch (customerChoice) {
            case "vanilla" -> System.out.println("One vanilla coming right up");
            case "chocolate" -> System.out.println("chocolate coming right up");
            case "strawberry" -> System.out.println("strawberry coming right up");
            default -> System.out.println("We don't have that");
        }

        int c = 0, d = 100, e = 50;
        if (c == 1 && e++ < 100){

        }
        System.out.println("e = " + e);

        boolean existence = true;
        int theAnswer = 42;
            if (existence || theAnswer++ == 42){}
        System.out.println(theAnswer);

//            int i = 1;
//        System.out.println("The loop hasn't started yet. The value i is" + i);
//        while(i < 10){
//            System.out.println("Now I'm in the loop. i has not incremented yet adn its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. i has incremented and its value is " + i);
//        }
//            System.out.println("The loop has ended because the conditional has tested false. The value of i is " + i);
        // do {
        // System.out.println("Now I'm in the loop. i has not incremented yet adn its value is " + i);
        // i++;
        // System.out.println("I'm still in the loop. i has incremented and its value is " + i);
        // } while (i < 10);
        // System.out.println("The loop has ended because the conditional has tested false. The value of i is " + i);

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
