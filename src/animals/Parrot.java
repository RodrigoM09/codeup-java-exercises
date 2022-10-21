package animals;

public class Parrot extends Bird implements Pet{


    public void beCute() {
        System.out.println("Human goes awwww");
    }

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Im a parrot. Polly want a cracker");
    }

    public void echo(String input){
        System.out.println(input);
    }

    public Parrot(){
        System.out.println("A new Parrot has been constructed");
    }

}
