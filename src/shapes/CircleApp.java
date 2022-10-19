package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDbl("Enter radius of the circle"));
        System.out.println(circle.getArea());
        System.out.printf("The area of your circle is %.2f and its circumference is %.2f", circle.getArea(), circle.getCircumference());
    }
}
