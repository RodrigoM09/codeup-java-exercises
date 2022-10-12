public class syntaxLecture {
    public static void main(String[] args) {
        // DECLARE VARIABLE WITHOUT INITIALIZING
        int weight;
        String breed;
        // INITIALIZE AFTER DECLARATION
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        // INITIALIZE AND DECLARE AT THE SAME TIME
        String name = "Grinch";
        int cutenessFactor = 10;
        // STATEMENT: "JVM, DO SOMETHING"
        System.out.println(name + " is a " + breed + ".");
        //CONDITIONAL LOGIC
        if (cutenessFactor > 8){
            System.out.println(name + " is cute.");
        } else {
            System.out.println(name + " needs to work on cuteness.");
        }
        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; //BYTES GO FROM -128 TO 127
        short mediumNumber; //SHORTS GO FROM -32768 TO 32767
        int number; // INTEGERS GO C. -2BILLION TO 2 BILLION
        long bigNumber; //LONG GO ABOUT -9 QUADRILLION TO 9 QUADRILLION

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

//          "CASTING-CONVERTING A VALUE FROM ONE DATA TYPE TO ANOTHER"
//        number = 2000000000;
//        smallNumber = (byte) number;
//        System.out.println(smallNumber);

        //LONG
        bigNumber = 9000000000L;

        float imaFloat = 2.34F;
        double imadouble = 9.01234567890123;
        System.out.println(imadouble);
        imaFloat = (float) imadouble;
        System.out.println(imaFloat);

        System.out.println((int) Math.pow(2, 3));
    }
}
