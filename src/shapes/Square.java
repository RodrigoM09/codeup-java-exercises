package shapes;
public class Square extends Rectangle{

    public int getArea(int side){
        return side * side;
    }
    public int getPerimeter(int side){
        return 4 * side;
    }

    public Square(int side){
        super.setLength(side);
        super.setWidth(side);
    }
}