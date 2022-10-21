package animals;

abstract public class Bird {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String noise;
    public String getNoise(){
        return noise;
    }

    public void setNoise(String noise){
        this.noise = noise;
    }

    public void makeNoise(){
        System.out.println("caw caw");
    }

    public Bird(){
        System.out.println("A new Bird has been constructed");
    }

}