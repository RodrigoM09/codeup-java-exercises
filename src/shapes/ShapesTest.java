package shapes;
public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        Measurable square = new Square(5,5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        
        Measurable rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());






//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}