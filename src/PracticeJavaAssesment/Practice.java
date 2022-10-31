package PracticeJavaAssesment;

import java.util.ArrayList;

public class Practice {
    /**
     * 1. Create a class called Practice with a main method.
     */
    public static void main(String[] args) {
        System.out.println(subtractTen(20));
        double[] result ={5,10,15};
        System.out.println(average(result));
        for(int number : multiplyAll(5, new ArrayList<>()))
            System.out.println(number);
    }

    /**
     * 2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
     */
    public static int subtractTen(int number) {
        return number - 10;
    }

    /**
     * 3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
     */
    public static double average(double numbers[]) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double result = sum / numbers.length;

        return result;
    }

    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(number * multiplier);
        }
        return result;
    }

}


