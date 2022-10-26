package util;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Input {
    private Scanner scanner;
    private String userInput;

    public String getString(){
        return String.valueOf(userInput);
    }

    public String getString(String question){
        System.out.println(question);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yay or Nay?");
        userInput = scanner.nextLine();
        System.out.println(userInput);
        if (userInput.equals("y")) {
            System.out.println("This input is True");
            return true;
        }
        else if (userInput.equals("yes")) {
            System.out.println("This input is True");
            return true;
        }
        else {
            System.out.println("This input is False");
            return false;
        }
    }

    public static int generateRandom(int max){
        return (int) Math.ceil(Math.random() * max);
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int numInput = scanner.nextInt();
        if (numInput >= min & numInput <= max){
            System.out.println("You entered " + numInput);
            return numInput;
        } else {
            System.out.printf("You entered %d, which is out of the range %n", numInput);
        }
        return getInt(min, max);
    }
    public int getInt(){
        System.out.println("Enter your number: ");
        Integer.valueOf(getString());
        return Integer.valueOf(getString());
    }


    public double getDbl(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double numInput = scanner.nextDouble();
        if (numInput >= min & numInput <= max){
            System.out.println("You entered " + numInput);
            return numInput;
        } else {
            System.out.printf("You entered %d, which is out of the range %n", numInput);
        }
        return getDbl(min, max);
    }

    public double getDbl(String prompt){
        System.out.println(prompt);
        Double.valueOf(getString());
        return Double.valueOf(getString());
    }

    public Input(){
        this.scanner = new Scanner(System.in);
        }
    }
