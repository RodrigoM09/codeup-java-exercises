package PracticeJavaAssesment;
/** 10. Create an interface named Companion. */
public interface Companion {
   public static String snuggle(){

       return "wants to snuggle";
   }

    /** The Companion interface should specify an instance method named snuggle that has no arguments and returns a String.
     Change your PetDog class, so it implements the Companion interface. */
    /**  The implementation of the snuggle method on the PetDog class should return "name wants to snuggle"
     , where name is the inherited instance property. */
}
