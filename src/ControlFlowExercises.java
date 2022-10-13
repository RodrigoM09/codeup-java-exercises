import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }

        int j = 0;
         do {
         j+=2;
         System.out.println(j);
         } while (j < 100);

        int k = 100;

        do {
            k-=5;
            System.out.println(k);
        } while (k > -10 );

        long l = 2;

        do {
            System.out.println(l);
            l= l * l;
        } while (l < 1000000);

        for (int m = 5; i<=15; m++){
            System.out.println(m);
        }

        for (int n =100; n >= -10; n-=5){
            System.out.println(n);
        }

        for (int r = 1; r <= 100; r++) {
            if  (r % 3 == 0 & r % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (r % 5 == 0) {
                System.out.println("Buzz");
            } else if (r % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(r);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            System.out.println("Enter a number: ");
            int userNum = scanner.nextInt();

            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------ | ------");
            for (int s = 1; s <= userNum; s++) {
                s = userNum;
                int numberSquared = (int) Math.pow(s, 2);
                int numberCubed = (int) Math.pow(s, 3);

                String message = "\n" + s + "      " + numberSquared + "      " + numberCubed;
                System.out.println(message);

            }   // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = scanner.next();
            System.out.println();
        }


        String choice2 = "y";
        while(choice2.equalsIgnoreCase("y")) {
        System.out.println("Enter your grade: ");
        int userGrade = scanner.nextInt();
        if (userGrade <= 59){
            System.out.println("You're a failure");
        } else if (userGrade <= 66){
            System.out.println("Your letter grade is a D");
        } else if (userGrade <= 79){
            System.out.println("Your letter grade is a C");
        } else if (userGrade <= 87) {
            System.out.println("Your letter grade is a B");
        } else if (userGrade <= 100) {
            System.out.println("Your letter grade is a A");
        }
            System.out.print("Continue? (y/n): ");
            choice2 = scanner.next();
            System.out.println();
        }
    }
}
