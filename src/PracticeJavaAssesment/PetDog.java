package PracticeJavaAssesment;
/** 6. Create a PetDog class that inherits from Pet. */
public class PetDog extends Pet implements Companion{

    /** 8. Write a constructor for PetDog that sets its name, type, and trained properties. */

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    /** 7. In PetDog, create a boolean instance variable, trained. */
    public boolean trained;


    /** 9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property. */
    public boolean isTrained(){
        return trained;
    }




    /** 11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly. */
}
