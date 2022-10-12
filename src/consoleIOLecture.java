public class consoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Wey-wot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;

        System.out.printf("Good, %s %s!%n", timeOfDay, cohort);
        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        System.out.println("Will this be on a separate line?");
        System.out.println("How about this?");
        System.out.printf("The number is %08.2f%n", someNumber);
        System.out.printf("The number is %-11.2f%n", someNumber);

    }
}
