package Vehicles;
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Vroom Vroom");
    }
    public Vehicle(){}

    public Vehicle(String name){
        this.name = name;
    }

    public void alarm(){
        System.out.println("weewoo weewoo");
    }
}
