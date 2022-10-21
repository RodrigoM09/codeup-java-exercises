package animals;

public class TweetyBird extends Bird{
    // overriding: a subclass redefined one of its inherited methods when it needs to change or
    // extend
    public void makeNoise(){
        System.out.println("Tweet tweet");
    }
}