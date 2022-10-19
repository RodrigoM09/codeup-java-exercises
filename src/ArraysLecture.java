import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
     int[] numbers;
     numbers = new int[5];
     numbers[0] = 78;
     numbers[1] = 253;
     numbers[2] = -23;
     numbers[3] = -789;
     numbers[4] = 36;
     Arrays.sort(numbers);
     System.out.println(numbers[0]);
     System.out.println(Arrays.toString(numbers));

     for (int number : numbers){
         System.out.println(number);
     }
     for (int i =0; i < numbers.length; i++){
         System.out.printf("The number at index %d is %d%n", i, numbers[i]);
     }

        String[] wordsForWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "weird"};
        System.out.println(wordsForWeird[2]);

        for(String wordForWeird : wordsForWeird){
            System.out.println(wordForWeird);
        }

    }
}
