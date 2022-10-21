package Vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle Porsche = new Vehicle();
        Porsche.setName("911 GT3");
        System.out.println(Porsche.getName() + " goes ");
        Porsche.makeNoise();

        Motorcycle yamaha = new Motorcycle();
        yamaha.setName("Yamaha");
        System.out.println(yamaha.getName() + " goes ");
        yamaha.makeNoise();
        yamaha.breakDown();
    }
}
