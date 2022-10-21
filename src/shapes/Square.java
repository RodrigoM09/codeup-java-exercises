package shapes;
public class Square extends Quadrilateral{
    protected int length;
    protected int width;

    public Square(int length, int width){
        super(length,width);
        this.length = length;
        this.width = width;
    }

    void setLength(int length) {}

    void setWidth(int width) {}

//    private int side;
//    public int getArea(){
//        return side * side;
//    }
//    public int getPerimeter(){
//        return 4 * side;
//    }
}