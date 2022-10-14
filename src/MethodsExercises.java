import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        System.out.println("Your numbers added together: " + add(one, two));
        System.out.println("Your numbers subtracted: " + subtraction(one, two));
        System.out.println("Your numbers multiplied: " + multiplication(one, two));
        System.out.println("Your numbers divided: " + division(one, two));
        System.out.println("The modulus of your numbers are: " + modulus(one, two));



        int userInput = getInteger(1, 10);
        System.out.println("Your number: " + userInput);

        int i, fact = 1;
        int number= scanner.nextInt();//It is the number to calculate factorial
        System.out.println("Input a number between 1 and 10 to find factorial: ");
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public static int add(int one, int two) {
        return one + two;
    }
    public static int subtraction(int one, int two){
       return one - two;
    }
    public static int multiplication(int one, int two){
        return one * two;
    }
    public static int division(int one, int two){
        return one / two;
    }

    public static int modulus(int one, int two){
        return one % two;
    }


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput > min & userInput  <= max){
            return userInput;
        }else{
            return getInteger(min, max);
        }
    }

    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}