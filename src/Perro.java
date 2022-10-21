import animals.Quote;

public class Perro {
    //Create a class for your favorite type of animal. The class should be named for your animal - Cat, animals.Dog, Parrot etc.


    // It should have two instance variables - name and sound - and one method - makeNoise().
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String sound;

    // The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.
    public void makeNoise(){
        System.out.printf("My name is %s, and I go %s.%n", name, Quote.RandomQuote());
    }

}
