package PracticeJavaAssesment;

import java.util.ArrayList;
import java.util.List;

public class PetDogTest {
    public static void main(String[] args) {
        /** 11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly. */
        PetDog petDog = new PetDog("Brownie","dog",true);
        PetDog petDog1 = new PetDog("Daisy","English Mastiff",true);
        PetDog petDog2 = new PetDog("Rex","Pitbull",false);
        System.out.println(petDog.snuggle());
        ArrayList<PetDog> petDogs = new ArrayList<>(List.of(petDog,petDog1,petDog2));
        PetDog.allSnuggle(petDogs);
    }
}

