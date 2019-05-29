package FirstLearn;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        System.out.println("length is " + r1.getLength());
        System.out.println("square is " + r1.getSquare());
    }
}
class Rectangle{
    private int width;
    private int height;

    Rectangle() {
        //this(1,2);
    }
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getLength() {
        return 2 * (width + height);
    }
    public  int getSquare() {
        return width * height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
