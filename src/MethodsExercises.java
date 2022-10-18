import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int one = scanner.nextInt();
//        int two = scanner.nextInt();
//        System.out.println("Your numbers added together: " + add(one, two));
//        System.out.println("Your numbers subtracted: " + subtraction(one, two));
//        System.out.println("Your numbers multiplied: " + multiplication(one, two));
//        System.out.println("Your numbers divided: " + division(one, two));
//        System.out.println("The modulus of your numbers are: " + modulus(one, two));
//
//
//
//        int userInput = getInteger(1, 10);
//        System.out.println("Your number: " + userInput);
//
//        System.out.println("this is your factorial: " + factorial(1,10));

        rollDice();
    }

//    public static int add(int one, int two) {
//        return one + two;
//    }
//    public static int subtraction(int one, int two){
//       return one - two;
//    }
//    public static int multiplication(int one, int two){
//        return one * two;
//    }
//    public static double division(double one, double two){
//        return one / two;
//    }
//
//    public static int modulus(int one, int two){
//        return one % two;
//    }
//
//
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        if (userInput >= min & userInput  <= max){
//            return userInput;
//        } else {
//            System.out.printf("You entered %d, which is out of the range %n", userInput);
//        }
//        return getInteger(min, max);
//    }
//
//
//// <-----------------------------MY SOLUTION-------------------------------------------------------------->
//    public static int factorial(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("util.Input a number between 1 and 10 to find factorial: ");
//        int number = scanner.nextInt();//It is the number to calculate factorial
//        int fact = 1;
//        scanner.close();
//        if (number < 0 )
//            System.out.println("Cant find factorial of negative numbers.");
//        else if (number <=1)
//        System.out.println();
//        else {
//            for( int i = number; i >=2; i--){
//                fact = fact * i;
//            }
//        }
//        return fact;
//    }


    public static int generateRandom(int max){
        return (int) Math.ceil(Math.random() * max);

    }
    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("util.Input number of sides on dice:");
        byte numberOfsides = scanner.nextByte();
        System.out.printf("Your dice have %d sides.%n", numberOfsides);
        System.out.println("Do you want to roll? y/n");
        String userChoice = scanner.next();
        while(userChoice.equals("y")) {
                System.out.println("You rolled the dice!");
                System.out.printf("You rolled %d and %d%n", generateRandom(numberOfsides), generateRandom(numberOfsides));
                System.out.println("Do you want to roll the dice again? y/n");
                userChoice = scanner.next();
            }
        }


    }
