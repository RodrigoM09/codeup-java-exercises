package Vehicles;
public class Motorcycle extends Vehicle {

    public void makeNoise(){
        System.out.println("mEEEE, mEEEE");
    }

    public void breakDown(){
        super.makeNoise();
        System.out.println("skirt skirt");
    }
    public Motorcycle(){}

    public Motorcycle(String name){
        this.setName(name);
    }
}