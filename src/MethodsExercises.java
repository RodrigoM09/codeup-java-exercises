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

    public static void factorial(int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 10 to find factorial: ");
        int number = scanner.nextInt();//It is the number to calculate factorial
        long fact = 1;
        scanner.close();
        if (number < 0 )
            System.out.println("Cant find factorial of negative numbers.");
        else if (number <=1)
        System.out.println();
        else {
            for( int i = number; i >=2; i--){
                fact = fact * i;
            }
            System.out.println();
        }
    }
}