package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    abstract void setLength(int length);

    public int getWidth() {
        return width;
    }

    abstract void setWidth(int width);

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Quadrilateral(){}

}