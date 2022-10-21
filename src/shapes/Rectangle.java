package shapes;
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    public int getLength() {
        return super.getLength();
    }

    public void setLength(int length) {
    }

    public int getWidth() {
        return super.getWidth();
    }

    public void setWidth(int width) {
    }

//    public int getLength() {
//        return length;
//    }
//    public void setLength(int length) {
//        this.length = length;
//    }
//    public int getWidth() {
//        return width;
//    }
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    protected int length;
//    protected int width;
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//    public int getArea(){
//        return length * width;
//    }
//    public Rectangle(){}
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
}
