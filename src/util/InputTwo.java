package util;

import java.util.Scanner;

public class InputTwo {

    private final Scanner scanner;

    public InputTwo() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // Solution: David Lara and John Pedrotti
    public boolean yesNo(){
        System.out.println("Yes or no?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    /*
        TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
     */
    public int getInt(){
        // GET USER INPUT AS A STRING.........
        //PARSE THE STRING INTO A NUMBER..........
        //IF THE PARSE THROWS AN EXCEPTION, RECURSION
        // IF NO EXCEPTION RETURN PARSED INPUT
        String userInput = getString();
        try{
        return Integer.valueOf(userInput);
        } catch (NumberFormatException e){
            System.out.println("Invalid input type. Enter a number!");
           return getInt();
        }
    }

    public static void main(String[] args) {
        InputTwo input = new InputTwo();
        int num = input.getInt();
    }


    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        String prompt = "Enter an integer between " + min + " and " + max + ":";
        System.out.println(prompt);
        int userInput = (int) getInt();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    /*
        TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
     */
    public double getDbl() {
        String userInput = getString();
        try {
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type. Enter a number!");
            return getDbl();
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        String prompt = "Enter an number between " + min + " and " + max + ":";
        System.out.println(prompt);
        double userInput = getDouble();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }

    private double getDouble() {
        return 0;
    }

}