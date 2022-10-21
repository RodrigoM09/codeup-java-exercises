package animals;

public class Parrot extends Bird{


    public void makeNoise(){
        super.makeNoise();
        System.out.println("Im a parrot bitch. Polly want a cracker");
    }
    public void echo(String input){
        System.out.println(input);
    }
    public Parrot(){
        System.out.println("A new Parrot has been constructed");
    }

}
