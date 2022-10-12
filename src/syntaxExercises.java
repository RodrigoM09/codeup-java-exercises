public class syntaxExercises {
    public static void main(String[] args) {
       int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Rodrigo";
        System.out.println(myString);


        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        y -= (x / y);
        System.out.println(y);

        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt);
    }
}
