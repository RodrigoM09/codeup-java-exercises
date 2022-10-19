package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDbl("Enter radius of the circle"));
        System.out.println(circle.getArea());
    }
}
