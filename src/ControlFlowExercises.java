public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i < 15){
            System.out.println(i);
            i++;
        }
            System.out.println(i);

        int j = 0;
         do {
         j+=2;
         System.out.println(j);
         } while (j < 100);

        int k = 100;
        do {
            k-=5;
            System.out.println(k);
        } while (k > -10 );

        long l = 2;
        do {
            l= l * l;
            System.out.println(l);
        } while (l < 1000000);
    }
}
