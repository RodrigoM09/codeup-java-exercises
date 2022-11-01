public class recursion {
    //write the recursive definition of an algorithm to find the minimum value in an array of integers
    public static int findMin(int[] numbers, int index){
        if(index == numbers.length - 1){
            return numbers[index];
        }
        int min = findMin(numbers, index + 1);
        if(numbers[index] < min){
            return numbers[index];
        } else {
            return min;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findMin(numbers, 9));
    }
}
