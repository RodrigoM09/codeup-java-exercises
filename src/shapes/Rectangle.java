package shapes;

public class Rectangle {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    protected int length;
    protected int width;

    public int getPerimeter(int length, int width){
        return 2 * length + 2 * width;
    }

    public int getArea(int length, int width){
        return length * width;
    }


    public Rectangle(){}

    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }
}
